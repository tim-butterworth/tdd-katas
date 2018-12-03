package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.solution.parameterizeConstructor.dependency;

import java.util.Random;

public class NetworkNotHiddenDependency implements NotHiddenDependency {
    private final String status;

    public NetworkNotHiddenDependency() {

        String statusToSet;

        try {
            attemptToConnectToServer();

            statusToSet = "CONNECTED_TO_SERVER";
        } catch (Exception e) {
            statusToSet = "NOT_CONNECTED";
        }

        this.status = statusToSet;

    }

    private void attemptToConnectToServer() throws Exception {
        int i = new Random().nextInt(10);

        if (i > 4) throw new Exception("Failed to make connection!");
    }

    @Override
    public void doStuff() {
        if (this.status.equals("CONNECTED_TO_SERVER")) {
            System.out.println("DOING REALLY INTERESTING STUFF");
        } else {
            System.out.println("DOING TOTALLY DIFFERENT STUFF");
        }
    }
}
