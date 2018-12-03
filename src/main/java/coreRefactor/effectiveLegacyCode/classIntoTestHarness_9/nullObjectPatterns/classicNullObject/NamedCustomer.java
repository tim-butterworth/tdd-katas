package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.classicNullObject;

import java.util.Random;

public class NamedCustomer implements Customer {

    private final String name;

    public NamedCustomer() {
        this.name = "customer" + new Random().nextInt();
    }

    @Override
    public void provideName(CustomerVisitor visitor) {
         visitor.visit(name);
    }
}
