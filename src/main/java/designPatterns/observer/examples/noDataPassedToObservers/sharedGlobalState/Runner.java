package designPatterns.observer.examples.noDataPassedToObservers.sharedGlobalState;

import designPatterns.observer.examples.noDataPassedToObservers.MySubject;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Runner {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();

        mySubject.register(new MyObserverSharedGlobalState("1"));
        mySubject.register(new MyObserverSharedGlobalState("2"));
        mySubject.register(new MyObserverSharedGlobalState("3"));

        Stream.of(1, 2, 3, 4).forEach(i -> {
            mySubject.dispatch();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Iterator<Map.Entry<String, List<String>>> iterator = GlobalState.stateMap.entrySet().iterator();

        StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, Spliterator.ORDERED), false)
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
