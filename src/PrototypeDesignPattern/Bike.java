package PrototypeDesignPattern;

public class Bike implements Prototype{
    private String color;
    private String engineType;

    public Bike(String color, String engineType){
        this.color=color;
        this.engineType = engineType;
    }

    @Override
    public Prototype clone() {
        return new Bike(color,engineType);
    }

    @Override
    public void displayInfo(){
        System.out.println("Bike Color: "+color+"---- Engine Type: "+engineType);
    }

    public void setColor(String color){
        this.color=color;
    }
}
