package BuilderDesignPattern;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setCrust("Thin Crust")
                .setCheese("Mozzarella")
                .setToppings("Mushrooms, Olives")
                .setSpicy(true)
                .setSize(12)
                .build();

        pizza.showDetails();
    }
}
