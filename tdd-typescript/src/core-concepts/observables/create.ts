import * as _ from "lodash";
import {
    of,
    from,
    empty,
    range,
    interval,
    timer,
    Observer,
    Observable,
    Subscription
} from "rxjs";

type print<T> = (s: T) => void;
type ObserverFn<T> = (obs: Observer<T>) => void;
const printer: print<number | string> = <T>(s: T) => console.log(s);
const printSection: print<string> = (message: string) => {
    console.log("");
    console.log(`--- ${message} ---`);
    console.log("");
};

printSection("of");
const ofObservable: Observable<string> = of("hi", "how", "are", "you", "?");
ofObservable.subscribe(printer);

printSection("create");
const createObservable: Observable<string> = Observable.create((observer: Observer<string>) => {
    observer.next("something");
    observer.next("anotherthing");
});
createObservable.subscribe(printer);

printSection("from");
const fromObservable: Observable<number> = from(_.range(10));
fromObservable.subscribe(printer);

printSection("range");
const rangeObservable: Observable<number> = range(0, 10);
rangeObservable.subscribe(printer);

printSection("empty");
const emptyObservable: Observable<string> = empty();
emptyObservable.subscribe({
    next: (s: string) => console.log(`next: ${s}`),
    complete: () => console.log("complete")
});

const printDate: (d: Date) => void = (date) => {
    console.log(`${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}:${date.getMilliseconds()}`);
};

const startInterval = (after: () => void) => {
    printSection("interval");

    const intervalObservable: Observable<number> = interval(1000);
    console.log("Time before starting interval:");
    printDate(new Date());
    const subscription: Subscription = intervalObservable.subscribe((n: number) => {
        if (n < 5) {
            console.log(`call number ${n}`);
            printDate(new Date());
        } else {
            subscription.unsubscribe();
            after();
        }
    });
}

const startTimer = () => {
    printSection("timer")

    const timerObservable: Observable<number> = timer(0, 1000);
    console.log("Time before staring timer:")
    printDate(new Date());
    const timerSubscription: Subscription = timerObservable.subscribe((n: number) => {
        if (n < 5) {
            console.log(`call number ${n}`);
            printDate(new Date());
        } else {
            timerSubscription.unsubscribe();
        }
    });
}

startInterval(startTimer);
