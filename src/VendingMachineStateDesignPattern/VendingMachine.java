package VendingMachineStateDesignPattern;

import VendingMachineStateDesignPattern.State.IdleState;
import VendingMachineStateDesignPattern.State.VendingMachineState;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private VendingMachineState vendingMachineState;
    private Inventory vendingMachineInventory;
    private List<Coin> coinList;

    VendingMachine() {
        this.vendingMachineState = new IdleState();
        this.vendingMachineInventory = new Inventory(10);
        this.coinList = new ArrayList<>();
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getVendingMachineInventory() {
        return vendingMachineInventory;
    }

    public void setVendingMachineInventory(Inventory vendingMachineInventory) {
        this.vendingMachineInventory = vendingMachineInventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    // State methods

    void pressEnterMoney(VendingMachine vendingMachine) throws Exception{
         vendingMachineState.pressEnterMoney(vendingMachine);
    }
    void enterMoney(VendingMachine vendingMachine, Coin coin) throws Exception{
        vendingMachineState.enterMoney(vendingMachine,coin);
    }
    void pressChooseProduct(VendingMachine vendingMachine) throws Exception{
        vendingMachineState.pressChooseProduct(vendingMachine);
    }
    void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception{
        vendingMachineState.chooseProduct(vendingMachine, codeNumber);
    }
    Item dispenseProduct(VendingMachine vendingMachine , int codeNumber) throws Exception{
        return vendingMachineState.dispenseProduct(vendingMachine, codeNumber);
    }
    int getChange(int returnChangeMoney) throws Exception{
        return vendingMachineState.getChange(returnChangeMoney);
    }
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception{
        return vendingMachineState.refundFullMoney(machine);
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception{
        vendingMachineState.updateInventory(machine,item,codeNumber);
    }
}
