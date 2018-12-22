package designPatterns.observer.examples.noDataPassedToObservers.sharedGlobalState;

import designPatterns.observer.examples.noDataPassedToObservers.MyObserver;

import java.util.LinkedList;
import java.util.List;

public class MyObserverSharedGlobalState implements MyObserver {

    private final String id;

    public MyObserverSharedGlobalState(String id) {
        this.id = id;
    }

    @Override
    public void update() {
        List<String> orDefault = GlobalState.stateMap.getOrDefault(id, new LinkedList<>());

        orDefault.add("Observable with id " + id + " was called at " + System.currentTimeMillis());

        GlobalState.stateMap.put(id, orDefault);
    }
}
