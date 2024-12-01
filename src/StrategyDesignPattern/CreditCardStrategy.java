package StrategyDesignPattern;

public class CreditCardStrategy implements Strategy{
    private String cardNumber;
    public CreditCardStrategy(String cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by Credit Card !!");
    }
}
