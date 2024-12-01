package AbstractFactoryDesignPattern;

public class Test {
    public static void main(String[] args) {
        CarFactory carFactory;
        String carType="Economy";

        if(carType.toLowerCase().equals("luxury")){
            carFactory = new EconomyCarFactory();
        }else{
            carFactory = new LuxuryCarFactory();
        }

        carFactory.createEngine().design();
        carFactory.createTyre().manufacture();
    }
}

//   Now think client is think about CarFactory he will pass string like economy and luxury and there
// should be abstraction like they should not see concrete class implementation
// So, first we will initialie the variable of type carFactory that will either be Luxury or Economy
// according to string provided.
// Now we know we need let's say Luxury Factory, there createEngine and createTyre method is there
// so these methods will return the respective Engine and Tyre implementation class but the return type will
// be generic Engine and tyre, now call the methods  of engine and tyre

// CarFactory- > Luxury CarFactory -> Create Engine , routing to LuxuryEngine return type is Engine interface
// -> now call design easily
