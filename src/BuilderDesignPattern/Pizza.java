package BuilderDesignPattern;

class Pizza {
    private String crust;
    private String cheese;
    private String toppings;
    private boolean isSpicy;
    private int size;

    // Private constructor
    private Pizza(PizzaBuilder builder) {
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.toppings = builder.toppings;
        this.isSpicy = builder.isSpicy;
        this.size = builder.size;
    }

    // Display the pizza details
    public void showDetails() {
        System.out.println("Pizza [crust=" + crust + ", cheese=" + cheese +
                ", toppings=" + toppings + ", isSpicy=" + isSpicy +
                ", size=" + size + "]");
    }

    // Static Builder Class
    public static class PizzaBuilder {
        private String crust;
        private String cheese;
        private String toppings;
        private boolean isSpicy;
        private int size;

        // Setters with return type as Builder for chaining
        public PizzaBuilder setCrust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder setToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public PizzaBuilder setSpicy(boolean isSpicy) {
            this.isSpicy = isSpicy;
            return this;
        }

        public PizzaBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        // Build method to create Pizza object
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

