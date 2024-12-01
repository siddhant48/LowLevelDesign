package DecoratorDesignPattern;

public class Farmhouse implements Pizza {
    @Override
    public double getCost(){
        return 2.9;
    }

    @Override
    public String description() {
        return "Farmhouse";
    }
}
