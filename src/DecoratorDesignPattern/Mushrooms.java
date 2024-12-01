package DecoratorDesignPattern;

public class Mushrooms extends PizzaToppingsDecorator{
    Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost(){
        return pizza.getCost() + 2.1;
    }

    @Override
    public String description() {
        return pizza.description()+", Mushroom";
    }
}
