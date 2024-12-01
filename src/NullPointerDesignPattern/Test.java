package NullPointerDesignPattern;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        vehicle.getTankCapacity();

        vehicle = VehicleFactory.getVehicleObject("Car");
        vehicle.getTankCapacity();
    }
}

// A null object (NullPointer class object) replace null return type
// No need to put null check
// in the nullpointer class define the default behaviour and create a factory class to return this nullpointer class by default
