package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.optional;

import java.util.Optional;

public class CustomerRepository {
    public Optional<Customer> findById(Integer id) {
        if (id % 2 == 0) {
            return Optional.of(new Customer());
        }
        return Optional.empty();
    }
}
