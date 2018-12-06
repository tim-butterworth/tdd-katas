package designPatterns.strategy.examples.constructorProvided;

import designPatterns.strategy.examples.strategies.Strategy;

public class ConstructorUseStrategy {
    private final Strategy strategy;

    public ConstructorUseStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String doThings() {
        return strategy.execute();
    }
}
