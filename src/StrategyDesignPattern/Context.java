package StrategyDesignPattern;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void pay(int amount){
        strategy.pay(amount);
    }
}
