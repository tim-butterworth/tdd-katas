package designPatterns.builder.reflectionBasedProxy;

import designPatterns.builder.reflectionBasedProxy.builder.BuilderInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ReflectionBuilderFactory {

    public <T, M extends GenericBuilder<T>> M getInstance(Class<M> tBuilderClass, Class<T> tClass) {
        InvocationHandler builderInvocationHandler = new BuilderInvocationHandler(tBuilderClass, tClass);

        Object instance = Proxy.newProxyInstance(
                tClass.getClassLoader(),
                new Class[]{ tBuilderClass },
                builderInvocationHandler
        );

        return (M) instance;
    }
}
