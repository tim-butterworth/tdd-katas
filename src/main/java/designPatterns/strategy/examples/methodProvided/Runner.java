package designPatterns.strategy.examples.methodProvided;

import designPatterns.strategy.examples.strategies.StrategyOne;
import designPatterns.strategy.examples.strategies.StrategyTwo;

public class Runner {
    public static void main(String[] args) {
        MethodUseStrategy methodUseStrategy = new MethodUseStrategy();

        System.out.println(methodUseStrategy.doStuff(new StrategyOne()));
        System.out.println(methodUseStrategy.doStuff(new StrategyTwo()));
    }
}
