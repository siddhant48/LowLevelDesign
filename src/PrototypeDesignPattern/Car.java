package PrototypeDesignPattern;

public class Car implements Prototype{
    private String color;
    private String engineType;

    public Car(String color, String engineType){
        this.color=color;
        this.engineType = engineType;
    }

    @Override
    public Prototype clone() {
        return new Car(color,engineType);
    }

    @Override
    public void displayInfo(){
        System.out.println("Car Color: "+color+"---- Engine Type: "+engineType);
    }
}
