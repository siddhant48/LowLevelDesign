package VendingMachineStateDesignPattern.State;

import VendingMachineStateDesignPattern.Coin;
import VendingMachineStateDesignPattern.Item;
import VendingMachineStateDesignPattern.VendingMachine;

import java.util.List;

public interface VendingMachineState {
    void pressEnterMoney(VendingMachine vendingMachine) throws Exception;
    void enterMoney(VendingMachine vendingMachine, Coin coin) throws Exception;
    void pressChooseProduct(VendingMachine vendingMachine) throws Exception;
    void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;
    Item dispenseProduct(VendingMachine vendingMachine , int codeNumber) throws Exception;
    int getChange(int returnChangeMoney) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;

}
