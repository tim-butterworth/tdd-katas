package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.problem;

import org.junit.Test;

import java.util.stream.IntStream;

public class ClassWithHiddenDependencyTest {

    @Test
    public void canCreateInstance() {
        IntStream.range(0, 10).forEach(i -> {
            ClassWithHiddenDependency classWithHiddenDependency = new ClassWithHiddenDependency();

            classWithHiddenDependency.makeStuffHappen();
        });
    }
}