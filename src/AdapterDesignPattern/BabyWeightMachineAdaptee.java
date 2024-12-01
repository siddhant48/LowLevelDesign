package AdapterDesignPattern;

public class BabyWeightMachineAdaptee implements WeighingMachineAdaptee{
    @Override
    public double getWeightInPounds() {
        return 19;
    }
}
