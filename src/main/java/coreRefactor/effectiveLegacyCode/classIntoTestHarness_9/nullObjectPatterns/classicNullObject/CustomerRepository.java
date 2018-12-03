package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.classicNullObject;

public class CustomerRepository {
    public Customer findById(Integer id) {
        if (id % 2 == 0) {
            return new NamedCustomer();
        }
        return new NullCustomer();
    }
}
