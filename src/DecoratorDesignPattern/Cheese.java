package DecoratorDesignPattern;

public class Cheese extends PizzaToppingsDecorator{
    Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost(){
        return pizza.getCost() + 3.8;
    }

    @Override
    public String description() {
        return pizza.description()+", Cheese";
    }

}
