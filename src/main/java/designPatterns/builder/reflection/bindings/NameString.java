package designPatterns.builder.reflection.bindings;

import designPatterns.builder.reflectionBasedProxy.getterSetterBinding.Binding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Binding
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NameString {
}
