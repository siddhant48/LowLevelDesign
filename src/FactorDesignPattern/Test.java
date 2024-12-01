package FactorDesignPattern;

public class Test {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.getPizza("margherita");
        pizza.prepare();
        pizza = pizzaFactory.getPizza("VEGGIE");
        pizza.prepare();

    }
}
