package designPatterns.strategy.examples.methodProvided;

import designPatterns.strategy.examples.strategies.Strategy;

public class MethodUseStrategy {

    public String doStuff(Strategy strategy) {
        return strategy.execute();
    }
}
