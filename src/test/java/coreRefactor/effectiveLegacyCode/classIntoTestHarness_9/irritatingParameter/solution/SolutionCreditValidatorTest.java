package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.solution;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.CreditMasterTestFactory;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators.CreditMaster;
import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.solution.collaborators.RGHConnection;
import org.junit.Test;

public class SolutionCreditValidatorTest {

    @Test
    public void name() {
        RGHConnection fakeConnection = new RGHConnection() {};

        CreditMaster creditMaster = new CreditMasterTestFactory().getInstance("credit-master-file.txt");

        new SolutionCreditValidator(
                fakeConnection,
                creditMaster,
                "Fancy Validator ID"
        );
    }
}