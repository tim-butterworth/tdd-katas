package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.hiddenDependency.problem.dependency;

import java.util.Random;

public class HiddenDependency {
    private final String status;

    public HiddenDependency() {

        String statusToSet;

        try {
            attemptToConnectToServer();

            statusToSet = "CONNECTED_TO_SERVER";
        } catch (Exception e) {
            System.out.println(e.getMessage());

            statusToSet = "NOT_CONNECTED";
        }

        this.status = statusToSet;

    }

    private void attemptToConnectToServer() throws Exception {
        int i = new Random().nextInt(10);

        if (i > 4) throw new Exception("Failed to make connection!");
    }

    public void doStuff() {
        if (this.status.equals("CONNECTED_TO_SERVER")) {
            System.out.println("DOING REALLY INTERESTING STUFF");
        } else {
            System.out.println("DOING TOTALLY DIFFERENT STUFF");
        }
    }
}
