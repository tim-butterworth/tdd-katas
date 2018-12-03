package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.classicNull;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 3, 4);
        CustomerRepository customerRepository = new CustomerRepository();

        List<String> customerNames = new LinkedList<>();
        for (Integer id : ids) {
            Customer customer = customerRepository.findById(id);

            if (customer != null) customerNames.add(customer.getName());
        }

        for (String customerName : customerNames) {
            System.out.println(customerName);
        }
    }
}
