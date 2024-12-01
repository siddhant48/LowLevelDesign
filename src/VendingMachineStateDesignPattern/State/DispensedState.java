package VendingMachineStateDesignPattern.State;

import VendingMachineStateDesignPattern.Coin;
import VendingMachineStateDesignPattern.Item;
import VendingMachineStateDesignPattern.VendingMachine;

import java.util.List;

public class DispensedState implements VendingMachineState{


    public DispensedState(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(vendingMachine, codeNumber);
    }

    @Override
    public void pressEnterMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    @Override
    public void enterMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");
    }

    @Override
    public void pressChooseProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        Item item = vendingMachine.getVendingMachineInventory().getItem(codeNumber);
        vendingMachine.getVendingMachineInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        System.out.println("Item with code number "+ codeNumber+" is dispensed !!");
        return item;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in Dispense state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("refund can not be happen in Dispense state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("inventory can not be updated in Dispense state");
    }
}
