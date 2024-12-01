package StrategyDesignPattern;

public class PaypalStrategy implements Strategy{
    private String email;
    public PaypalStrategy(String email){
        this.email=email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by Paypal !!");
    }
}
