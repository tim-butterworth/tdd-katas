package designPatterns.builder.reflection;

import designPatterns.builder.reflection.bindings.NameString;
import designPatterns.builder.reflection.bindings.ValueInteger;
import designPatterns.builder.reflectionBasedProxy.GenericBuilder;

public interface BuilderForSampleObj extends GenericBuilder<SampleObj> {

    @NameString
    BuilderForSampleObj name(String name);

    @ValueInteger
    BuilderForSampleObj value(Integer value);

}
