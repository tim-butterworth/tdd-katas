package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators.CreditMaster;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CreditMasterTestFactory {
    public CreditMaster getInstance(String resourcePath) {
        Path resolve = Paths.get(this.getClass().getClassLoader().getResource("").getPath())
                .resolve("..")
                .resolve("resources")
                .resolve(resourcePath);

        return new CreditMaster(
                resolve.toString(),
                true
        );
    }
}
