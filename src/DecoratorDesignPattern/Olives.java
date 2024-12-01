package DecoratorDesignPattern;

public class Olives extends PizzaToppingsDecorator{
    Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost(){
        return pizza.getCost() + 1.9;
    }

    @Override
    public String description() {
        return pizza.description()+", Olives";
    }
}
