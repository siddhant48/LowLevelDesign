package FactorDesignPattern;

public class PizzaFactory {
    Pizza getPizza(String pizzaType) {
        switch (pizzaType.toLowerCase()) {
            case "margherita":
                return new MargheritaPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
