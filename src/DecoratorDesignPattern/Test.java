package DecoratorDesignPattern;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        System.out.println("Pizza: " + pizza.description());
        System.out.println("Total Cost: $" + pizza.getCost());
        pizza = new Cheese(pizza);
        System.out.println("Pizza: " + pizza.description());
        System.out.println("Total Cost: $" + pizza.getCost());
        pizza= new Olives(pizza);
        System.out.println("Pizza: " + pizza.description());
        System.out.println("Total Cost: $" + pizza.getCost());
        pizza = new Mushrooms(pizza);
        System.out.println("Pizza: " + pizza.description());
        System.out.println("Total Cost: $" + pizza.getCost());
    }
}
