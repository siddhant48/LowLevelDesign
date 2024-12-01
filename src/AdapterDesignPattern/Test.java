package AdapterDesignPattern;

public class Test {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new BabyWeightMachineAdaptee());
        double weightInkg = weightMachineAdapter.getWeightInKg();
        System.out.println(weightInkg);
    }
}

// Adapter(2 line)  ->    Mid(Adapter that will take 2 and send 3)  ->     Socket(3 line)
// Server sends XML from client deal with JSON, need adapter in between
// Mostly used when we are getting the data in different format than expected


// Create a adaptee interface and implementation, there will be a client, so adapter will be connecting client
// and adaptee and act as a bridge.
// adapter implementation class will have 'has-a' relationship with adaptee that is it will take adaptee object in constructor
// for usage and will do the operation like converting the weight
// now client(test.java) will connect with adapter
