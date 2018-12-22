package designPatterns.observer.examples.noDataPassedToObservers.noSharedState;

import designPatterns.observer.examples.noDataPassedToObservers.MySubject;

public class Runner {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();

        mySubject.register(new NoStateObserver("Observer 1"));
        mySubject.register(new NoStateObserver("Observer 2"));

        mySubject.dispatch();
    }
}
