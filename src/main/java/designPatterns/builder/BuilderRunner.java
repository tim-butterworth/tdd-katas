package designPatterns.builder;

import designPatterns.builder.notRequiredProperties.ImmutableNoPropsRequiredGenerated;
import designPatterns.builder.notRequiredProperties.NoPropsRequired;
import designPatterns.builder.notRequiredProperties.NoPropsRequiredGenerated;
import designPatterns.builder.reflection.BuilderForSampleObj;
import designPatterns.builder.reflection.SampleObj;
import designPatterns.builder.reflectionBasedProxy.ReflectionBuilderFactory;
import designPatterns.builder.requiredProperties.AllPropsRequired;
import designPatterns.builder.requiredProperties.AllPropsRequiredGenerated;
import designPatterns.builder.requiredProperties.ImmutableAllPropsRequiredGenerated;

import java.lang.reflect.Method;

public class BuilderRunner {
    public static void main(String[] args) {
        AllPropsRequired allPropsRequired = AllPropsRequired.builder()
                .age(15)
                .name("name")
                .build();

        AllPropsRequiredGenerated someName = ImmutableAllPropsRequiredGenerated.builder()
                .age(12)
                .name("someName")
                .build();

        AllPropsRequiredGenerated build = ImmutableAllPropsRequiredGenerated.builder().from(someName).build();

        System.out.println(build == someName);
        System.out.println(build.equals(someName));
        NoPropsRequired noPropsRequired = NoPropsRequired.builder().build();

        NoPropsRequiredGenerated noPropsRequiredGenerated = ImmutableNoPropsRequiredGenerated.builder().build();

        System.out.println(noPropsRequiredGenerated.getAge());


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
