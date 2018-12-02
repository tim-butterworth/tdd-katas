package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators.CreditMaster;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators.Customer;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators.CustomerCertificate;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.solution.collaborators.RGHConnection;

import java.security.cert.Certificate;

public class CreditValidator {
    private final RGHConnection connection;
    private final CreditMaster master;
    private final String validatorID;

    public CreditValidator(
            RGHConnection connection,
            CreditMaster master,
            String validatorID
    ) {
        this.connection = connection;
        this.master = master;
        this.validatorID = validatorID;
    }

    public Certificate validateCustomer(Customer customer) {
        return new CustomerCertificate("fancy-type");
    }
}
