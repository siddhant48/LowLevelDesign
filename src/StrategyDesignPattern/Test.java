package StrategyDesignPattern;

public class Test {
    public static void main(String[] args) {
//        Context context = new Context(new CreditCardStrategy("411111111"));
//        context.pay(27);
//
//        context = new Context(new PaypalStrategy("sidd@gmail.com"));
//        context.pay(39);
        Context context = new Chargebee("411111111");
        context.pay(34);

        context= new Braintree("sidd@gmail.com");
        context.pay(29);
    }
}

// Mostly remember that this is being used after we find there are certain attributes ie pay in this cases
// that is required to be done in multiple ways , so create interface and implement strategy

// Now, create context, context will take which strategy we have to use according to the class passed like chargebee
// or braintree here and then we can call pay

//    Thought Process:
//        Adding new strategies doesn't require modifying existing code.
//        Identify behaviors that vary across classes or use cases.
//        Extract these behaviors into separate strategies.
//        Use an interface to define the behavior and implement various strategies.
//        Design a context class to use the strategies without worrying about the specific details of their implementation.


