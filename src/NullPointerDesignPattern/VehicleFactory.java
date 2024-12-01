package NullPointerDesignPattern;

public class VehicleFactory {

    static Vehicle getVehicleObject(String typeOfvehicle){
        if("Bike".equals(typeOfvehicle)){
            return new Bike();
        }
        return new NullPointer();
        //return null;
    }
}
