package AbstractFactoryDesignPattern;

public class EconomyTyre implements Tyre{
    @Override
    public void manufacture() {
        System.out.println("Manufacturing tyre for Economy Car!!");
    }
}
