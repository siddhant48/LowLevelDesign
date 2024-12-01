package StrategyDesignPattern;

public class Braintree extends Context{
    Braintree(String email){
        super(new PaypalStrategy(email));
    }
}
