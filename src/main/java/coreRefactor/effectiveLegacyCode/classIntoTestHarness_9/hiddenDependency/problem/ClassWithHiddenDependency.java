package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.problem;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.problem.dependency.HiddenDependency;

public class ClassWithHiddenDependency {

    private final HiddenDependency hiddenDependency;

    public ClassWithHiddenDependency() {
        this.hiddenDependency = new HiddenDependency();
    }

    public void makeStuffHappen() {
        hiddenDependency.doStuff();
    }
}
