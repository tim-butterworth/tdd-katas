package designPatterns.observer.examples.noDataPassedToObservers.sharedGlobalState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalState {
    public static Map<String, List<String>> stateMap = new HashMap<>();
}
