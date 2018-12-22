package designPatterns.observer.examples.noDataPassedToObservers.noSharedState;

import designPatterns.observer.examples.noDataPassedToObservers.MyObserver;

public class NoStateObserver implements MyObserver {

    private final String message;

    public NoStateObserver(String message) {
        this.message = message;
    }

    @Override
    public void update() {
        System.out.println(message);
    }
}
