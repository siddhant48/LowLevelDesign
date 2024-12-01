package StrategyDesignPattern;

public class Chargebee extends Context{
    Chargebee(String cardNumber ) {
        super(new CreditCardStrategy(cardNumber));
    }
}
