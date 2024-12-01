package DecoratorDesignPattern;

public abstract class PizzaToppingsDecorator implements Pizza {
    // The reason we are using like above is because it's interface so every method should be implemented here
    // but we just want to provide the base pizza here
    // so declare it as abstract because you can't instantiate abstract class so you have to inherit and implement all the
    // interface method there

    // If you are implemnting a method you have to implement all methods of interface, but in implementation class
    // if you add abstract then you can implement some (not all necessary) but the remaining methods must be impmented by
    // inheriting class
    public Pizza pizza;
    PizzaToppingsDecorator(Pizza pizza){
        this.pizza = pizza;
    }
}
