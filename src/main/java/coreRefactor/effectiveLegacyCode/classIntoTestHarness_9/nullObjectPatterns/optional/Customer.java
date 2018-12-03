package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.optional;

import java.util.Random;

public class Customer {

    private final String name;

    public Customer() {
        this.name = "customer" + new Random().nextInt();
    }

    public String getName() {
        return name;
    }
}
