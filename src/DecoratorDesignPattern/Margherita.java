package DecoratorDesignPattern;

public class Margherita implements Pizza{
    @Override
    public double getCost(){
        return 3.8;
    }

    @Override
    public String description() {
        return "Margherita";
    }
}
