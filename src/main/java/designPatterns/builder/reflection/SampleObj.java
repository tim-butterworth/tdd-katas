package designPatterns.builder.reflection;

import designPatterns.builder.reflection.bindings.NameString;
import designPatterns.builder.reflection.bindings.ValueInteger;

public interface SampleObj {
    @NameString
    String getName();

    @ValueInteger
    Integer getValue();
}
