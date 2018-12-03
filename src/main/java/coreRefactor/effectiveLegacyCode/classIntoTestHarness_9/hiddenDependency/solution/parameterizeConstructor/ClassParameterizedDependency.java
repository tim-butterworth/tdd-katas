package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.solution.parameterizeConstructor;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.solution.parameterizeConstructor.dependency.NetworkNotHiddenDependency;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.solution.parameterizeConstructor.dependency.NotHiddenDependency;

public class ClassParameterizedDependency {

    private final NotHiddenDependency notHiddenDependency;

    //This constructor is here to preserve the original signature
    public ClassParameterizedDependency() {
        this(new NetworkNotHiddenDependency());
    }

    public ClassParameterizedDependency(NotHiddenDependency notHiddenDependency) {
        this.notHiddenDependency = notHiddenDependency;
    }

    public void doThings() {
        notHiddenDependency.doStuff();
    }

}
