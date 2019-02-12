package designPatterns.builder.reflectionBasedProxy.builder;

import designPatterns.builder.reflectionBasedProxy.builtObject.BuiltObjectInvocationHandler;
import designPatterns.builder.reflectionBasedProxy.GenericBuilder;
import designPatterns.builder.reflectionBasedProxy.MethodInvocationTracker;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuilderInvocationHandler<T> implements InvocationHandler {
    private final Class<? extends GenericBuilder<T>> tBuilderClass;
    private final Class<T> tClass;

    private final List<Method> setterMethods;
    private final Map<Method, MethodInvocationTracker> concurrentMethodMap;

    public BuilderInvocationHandler(Class<? extends GenericBuilder<T>> tBuilderClass, Class<T> tClass) {
        this.tBuilderClass = tBuilderClass;
        this.tClass = tClass;

        setterMethods = Stream.of(tBuilderClass.getMethods())
                .filter(m -> m.getParameterCount() == 1)
                .collect(Collectors.toList());

        Map<Method, MethodInvocationTracker> methodIntegerHashMap = setterMethods.stream().reduce(
                new HashMap<>(),
                (map, method) -> {
                    map.put(method, new MethodInvocationTracker());
                    return map;
                },
                (map1, map2) -> {
                    HashMap<Method, MethodInvocationTracker> combined = new HashMap<>();

                    combined.putAll(map1);
                    combined.putAll(map2);

                    return combined;
                });

        concurrentMethodMap = new ConcurrentHashMap<>();
        concurrentMethodMap.putAll(methodIntegerHashMap);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        MethodInvocationTracker methodInvocationTracker = concurrentMethodMap.get(method);
        if (method.getName().equals("build")) {
//            validateAllMethodsHaveBeenCalled();
            return Proxy.newProxyInstance(
                    tClass.getClassLoader(),
                    new Class<?>[]{tClass},
                    new BuiltObjectInvocationHandler(concurrentMethodMap)
            );
        } else if (methodInvocationTracker != null) {
            methodInvocationTracker.setValue(args[0]);

            return proxy;
        }

        return null;
    }
}
