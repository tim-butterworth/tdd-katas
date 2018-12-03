package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.nullObjectPatterns.classicNullObject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 3, 4);
        CustomerRepository customerRepository = new CustomerRepository();

        List<String> customerNames = new LinkedList<>();
        CustomerVisitor customerVisitor = new CustomerVisitor() {

            @Override
            public void visit(String name) {
                customerNames.add(name);
            }
        };

        for (Integer id : ids) {
            Customer customer = customerRepository.findById(id);

            customer.provideName(customerVisitor);
        }

        for (String customerName : customerNames) {
            System.out.println(customerName);
        }
    }
}
