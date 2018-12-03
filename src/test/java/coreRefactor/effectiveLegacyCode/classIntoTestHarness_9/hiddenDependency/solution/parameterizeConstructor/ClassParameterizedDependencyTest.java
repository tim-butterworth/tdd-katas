package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.solution.parameterizeConstructor;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.solution.parameterizeConstructor.dependency.NotHiddenDependency;
import org.junit.Test;

import java.util.stream.IntStream;

public class ClassParameterizedDependencyTest {

    @Test
    public void canCreateInstance() {
        IntStream.range(1, 10).forEach(i -> {
            ClassParameterizedDependency classParameterizedDependency = new ClassParameterizedDependency(new NotHiddenDependency() {
                @Override
                public void doStuff() {
                    System.out.println("Reliably does the same thing!");
                }
            });

            classParameterizedDependency.doThings();
        });
    }
}