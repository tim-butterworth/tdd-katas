package designPatterns.strategy.examples.constructorProvided;

import designPatterns.strategy.examples.strategies.StrategyOne;
import designPatterns.strategy.examples.strategies.StrategyTwo;

public class Runner {
    public static void main(String[] args) {
        ConstructorUseStrategy withStrategyOne = new ConstructorUseStrategy(new StrategyOne());
        System.out.println(withStrategyOne.doThings());

        ConstructorUseStrategy withStrategyTwo = new ConstructorUseStrategy(new StrategyTwo());
        System.out.println(withStrategyTwo.doThings());
    }
}
