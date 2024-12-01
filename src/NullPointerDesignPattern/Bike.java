package NullPointerDesignPattern;

public class Bike implements Vehicle{
    @Override
    public int getTankCapacity() {
        System.out.println("Tank Capacity of Bike is 12 !!");
        return 12;
    }

    @Override
    public int seatCapacity() {
        System.out.println("Seat Capacity of Bike is 2 !!");
        return 2;
    }
}
