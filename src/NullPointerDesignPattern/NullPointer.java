package NullPointerDesignPattern;

public class NullPointer implements Vehicle{
    @Override
    public int getTankCapacity() {
        System.out.println("Tank Capacity of Null Pointer default is 0 !!");
        return 0;
    }

    @Override
    public int seatCapacity() {
        System.out.println("Seat Capacity of Null Pointer default is 0 !!");
        return 0;
    }
}
