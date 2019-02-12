package designPatterns.builder.reflectionBasedProxy.builtObject;

import designPatterns.builder.reflectionBasedProxy.MethodInvocationTracker;
import designPatterns.builder.reflectionBasedProxy.getterSetterBinding.Binding;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BuiltObjectInvocationHandler implements InvocationHandler {
    private final Map<Annotation, Object> lookupMap;

    public BuiltObjectInvocationHandler(Map<Method, MethodInvocationTracker> methodValueMap) {
        lookupMap = populateLookupMap(methodValueMap);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Optional<Annotation> annotation = findBindingAnnotation(method.getAnnotations());

        Object[] valueHolder = new Object[1];

        annotation.ifPresent(a -> valueHolder[0] = lookupMap.get(a));

        if (method.getName().equals("toString")) {
            return lookupMap.toString();
        }

        return valueHolder[0];
    }

    private Map<Annotation, Object> populateLookupMap(Map<Method, MethodInvocationTracker> methodValueMap) {
        Map<Annotation, Object> annotationValueMap;
        annotationValueMap = new ConcurrentHashMap<>();

        for (Map.Entry<Method, MethodInvocationTracker> methodValue : methodValueMap.entrySet()) {
            Method method = methodValue.getKey();
            Object value = methodValue.getValue().getValue();

            Optional<Annotation> annotation = findBindingAnnotation(method.getAnnotations());

            annotation.ifPresent(a -> annotationValueMap.put(a, value));
        }
        return annotationValueMap;
    }

    private Optional<Annotation> findBindingAnnotation(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            Annotation[] metaAnnotations = annotation.annotationType().getAnnotations();

            for (Annotation metaAnnotation : metaAnnotations) {
                if (metaAnnotation.annotationType() == Binding.class) return Optional.of(annotation);
            }
        }

        return Optional.empty();
    }
}