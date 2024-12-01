package AbstractFactoryDesignPattern;

public class EconomyCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new EconomyEngine();
    }

    @Override
    public Tyre createTyre() {
        return new EconomyTyre();
    }
}
