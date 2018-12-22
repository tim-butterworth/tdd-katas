package designPatterns.observer.examples.noDataPassedToObservers;

import java.util.LinkedList;
import java.util.List;

public class MySubject {

    private List<MyObserver> observers;

    public MySubject() {
        this.observers = new LinkedList<>();
    }

    public void register(MyObserver observer) {
        observers.add(observer);
    }

    public void deRegister(MyObserver observer) {
        observers.remove(observer);
    }

    public void dispatch() {
        observers.forEach(MyObserver::update);
    }
}
