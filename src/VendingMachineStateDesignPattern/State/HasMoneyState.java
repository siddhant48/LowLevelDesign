package VendingMachineStateDesignPattern.State;

import VendingMachineStateDesignPattern.Coin;
import VendingMachineStateDesignPattern.Item;
import VendingMachineStateDesignPattern.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements VendingMachineState{

    public HasMoneyState(){
        System.out.println("Currently Vending machine is in HasMoneyState!!");
    }

    @Override
    public void pressEnterMoney(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void enterMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void pressChooseProduct(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        List<Coin> toBeReturnedMoney = new ArrayList<>(machine.getCoinList());
        machine.setVendingMachineState(new IdleState(machine));
        return toBeReturnedMoney;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }
}
