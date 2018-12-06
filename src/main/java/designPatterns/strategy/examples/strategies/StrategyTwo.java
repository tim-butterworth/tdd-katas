package designPatterns.strategy.examples.strategies;

public class StrategyTwo implements Strategy {
    @Override
    public String execute() {
        return "This is strategy two!";
    }
}
