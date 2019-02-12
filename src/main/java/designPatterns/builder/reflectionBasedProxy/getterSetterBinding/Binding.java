package designPatterns.builder.reflectionBasedProxy.getterSetterBinding;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface Binding {
}
