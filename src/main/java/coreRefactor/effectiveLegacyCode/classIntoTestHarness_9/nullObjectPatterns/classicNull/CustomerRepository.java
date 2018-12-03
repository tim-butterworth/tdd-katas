package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.classicNull;

public class CustomerRepository {
    public Customer findById(Integer id) {
        if (id % 2 == 0) {
            return new Customer();
        }
        return null;
    }
}
