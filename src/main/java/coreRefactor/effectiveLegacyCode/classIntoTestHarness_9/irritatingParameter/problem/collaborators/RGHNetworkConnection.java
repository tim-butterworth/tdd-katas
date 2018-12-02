package coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.problem.collaborators;

import coreRefactor.effectiveLegacyCode.classIntoTestHarness_9.irritatingParameter.solution.collaborators.RGHConnection;

import java.io.IOException;
import java.util.Random;

public class RGHNetworkConnection implements RGHConnection {
    public RGHNetworkConnection(
            int port,
            String name,
            String password
    ) throws IOException {
        SocketConnection socketConnection = establishConnection(port, name, password);
    }

    private SocketConnection establishConnection(
            int port,
            String name,
            String password
    ) throws IOException {
        Random random = new Random();

        if (random.nextInt(10) > 4) {
            throw new IOException("Not this time!");
        }

        return new SocketConnection();
    }
}
