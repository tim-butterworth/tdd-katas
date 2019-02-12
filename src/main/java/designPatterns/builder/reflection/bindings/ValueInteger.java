package designPatterns.builder.reflection.bindings;

import designPatterns.builder.reflectionBasedProxy.getterSetterBinding.Binding;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Binding
@Retention(RetentionPolicy.RUNTIME)
public @interface ValueInteger {
}
