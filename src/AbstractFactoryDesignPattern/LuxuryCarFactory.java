package AbstractFactoryDesignPattern;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
