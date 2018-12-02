package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.CreditMasterTestFactory;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators.CreditMaster;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators.RGHNetworkConnection;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.solution.collaborators.RGHConnection;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CreditValidatorTest {

    @Test
    public void validateCustomer() throws Exception {
        CreditMaster master = new CreditMasterTestFactory().getInstance("credit-master-file.txt");

        RGHConnection connection = new RGHNetworkConnection(
                8080,
                "unique-server-name",
                "S3CR3T"
        );

        new CreditValidator(
                connection,
                master,
                "Extra fancy validator"
        );
    }
}