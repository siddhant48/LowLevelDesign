package AdapterDesignPattern;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeighingMachineAdaptee weighingMachineAdaptee;
    WeightMachineAdapterImpl(WeighingMachineAdaptee weighingMachineAdaptee) {
        this.weighingMachineAdaptee = weighingMachineAdaptee;
    }
    @Override
    public double getWeightInKg() {
        double weightInPounds = weighingMachineAdaptee.getWeightInPounds();
        return weightInPounds * 0.45;
    }
}
