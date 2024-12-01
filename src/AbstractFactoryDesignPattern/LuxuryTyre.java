package AbstractFactoryDesignPattern;

public class LuxuryTyre implements Tyre{
    @Override
    public void manufacture() {
        System.out.println("Manufacturing tyre for Luxury Car!!");
    }
}
