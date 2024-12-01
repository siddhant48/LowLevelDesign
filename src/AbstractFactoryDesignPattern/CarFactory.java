package AbstractFactoryDesignPattern;

public interface CarFactory {
    Engine createEngine();
    Tyre createTyre();
}
