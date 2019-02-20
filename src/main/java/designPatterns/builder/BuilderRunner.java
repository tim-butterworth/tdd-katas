package designPatterns.builder;

import designPatterns.builder.notRequiredProperties.NoPropsRequired;
import designPatterns.builder.reflection.BuilderForSampleObj;
import designPatterns.builder.reflection.SampleObj;
import designPatterns.builder.reflectionBasedProxy.ReflectionBuilderFactory;
import designPatterns.builder.requiredProperties.AllPropsRequired;

import java.lang.reflect.Method;

public class BuilderRunner {
    public static void main(String[] args) {
        AllPropsRequired allPropsRequired = AllPropsRequired.builder()
                .age(15)
                .name("name")
                .build();

        NoPropsRequired noPropsRequired = NoPropsRequired.builder().build();

        ReflectionBuilderFactory reflectionBuilderFactory = new ReflectionBuilderFactory();


        Method[] methods = BuilderForSampleObj.class.getMethods();

        BuilderForSampleObj instance = reflectionBuilderFactory.getInstance(BuilderForSampleObj.class, SampleObj.class);

        SampleObj sampleObj = instance
                .name("name")
                .value(100)
                .build();

        System.out.println(sampleObj.getName());
        System.out.println(sampleObj.getValue());
        System.out.println(sampleObj);

    }

}
