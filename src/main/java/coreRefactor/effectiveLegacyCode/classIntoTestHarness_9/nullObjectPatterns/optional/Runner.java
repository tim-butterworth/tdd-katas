package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.optional;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 3, 4);
        CustomerRepository customerRepository = new CustomerRepository();

        List<String> customerNames = new LinkedList<>();
        for (Integer id : ids) {
            Optional<Customer> customer = customerRepository.findById(id);

            customer
                    .map(Customer::getName)
                    .ifPresent(customerNames::add);
        }

        for (String customerName : customerNames) {
            System.out.println(customerName);
        }
    }
}
