package VendingMachineStateDesignPattern.State;

import VendingMachineStateDesignPattern.Coin;
import VendingMachineStateDesignPattern.Item;
import VendingMachineStateDesignPattern.ItemShelf;
import VendingMachineStateDesignPattern.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class SelectionState implements VendingMachineState{

    public SelectionState(){
        System.out.println("System is in Selection state Currently !!");
    }

    @Override
    public void pressEnterMoney(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void enterMoney(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void pressChooseProduct(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
       Item item =vendingMachine.getVendingMachineInventory().getItem(codeNumber);
        int moneyToBePaid= item.getPrice();
        int amountPaid=0;
        List<Coin> coinList = vendingMachine.getCoinList();
        for(int i=0;i<coinList.size();i++){
            amountPaid+= coinList.get(i).getCoinValue();
        }

        if(amountPaid < moneyToBePaid){
            System.out.println("Insufficient Amount, Product you selected is for price: " + moneyToBePaid + " and you paid: " + amountPaid);
            refundFullMoney(vendingMachine);
            throw new Exception("Amount Paid is less than Product price !!");
        }else {
            getChange(amountPaid-moneyToBePaid);
            vendingMachine.setVendingMachineState(new DispensedState(vendingMachine,codeNumber));
        }
        return;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        List<Coin> returnCoins = new ArrayList<>(machine.getCoinList());
        machine.setVendingMachineState(new IdleState(machine));
        return returnCoins;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
