package PrototypeDesignPattern;

public class Test {
    public static void main(String[] args) {
        Prototype bike = new Bike("Black", "Inline-4");
        bike.displayInfo();

        Prototype cloneBike = bike.clone();
        cloneBike.displayInfo();

        //((Bike) bike).setColor("green"); typecasting
//        if (bike instanceof Bike) {
//            ((Bike) bike).setColor("green"); //typecasting
//        }

        Prototype car = new Car("Red","V8");
        car.displayInfo();

        Prototype cloneCar = car.clone();
        cloneCar.displayInfo();
    }
}


// Implement the clone method in the main class itself rather than cloning it
// in other class that needs the clone
