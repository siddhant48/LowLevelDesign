package VendingMachineStateDesignPattern.State;

import VendingMachineStateDesignPattern.Coin;
import VendingMachineStateDesignPattern.Item;
import VendingMachineStateDesignPattern.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements VendingMachineState{

    public IdleState(){
        System.out.println("System is in Idle state Currently !!");
    }

    public IdleState(VendingMachine vendingMachine){
        System.out.println("System is in Idle state Currently !!");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void pressEnterMoney(VendingMachine vendingMachine) throws Exception {
         vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void enterMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("You cannot enter Money in Idle state");
    }

    @Override
    public void pressChooseProduct(VendingMachine vendingMachine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("You cannot  Choose Product in Idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
            throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.getVendingMachineInventory().addItem(item,codeNumber);
    }
}
