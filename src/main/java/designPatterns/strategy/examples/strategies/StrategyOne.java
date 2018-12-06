package designPatterns.strategy.examples.strategies;

public class StrategyOne implements Strategy {
    @Override
    public String execute() {
        return "This is strategy 1";
    }
}
