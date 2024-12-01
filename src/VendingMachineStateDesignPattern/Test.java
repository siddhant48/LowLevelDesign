package VendingMachineStateDesignPattern;

import VendingMachineStateDesignPattern.State.VendingMachineState;

public class Test {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {

            // Idle State
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            vendingMachine.pressEnterMoney(vendingMachine);

            //HasMoneyState

            vendingMachine.enterMoney(vendingMachine, Coin.NICKEL);
            vendingMachine.enterMoney(vendingMachine, Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");

            vendingMachine.pressChooseProduct(vendingMachine);

            // SelectionState- Dispense will happen automatically

            vendingMachine.chooseProduct(vendingMachine,102);

            displayInventory(vendingMachine);



        }catch(Exception e){
            displayInventory(vendingMachine);
        }
    }
    private static void fillUpInventory(VendingMachine vendingMachine){
    ItemShelf[] slots = vendingMachine.getVendingMachineInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
        Item newItem = new Item();
        if(i >=0 && i<3) {
            newItem.setItemType(ItemType.COKE);
            newItem.setPrice(12);
        }else if(i >=3 && i<5){
            newItem.setItemType(ItemType.PEPSI);
            newItem.setPrice(9);
        }else if(i >=5 && i<7){
            newItem.setItemType(ItemType.JUICE);
            newItem.setPrice(13);
        }else if(i >=7 && i<10){
            newItem.setItemType(ItemType.SODA);
            newItem.setPrice(7);
        }
        slots[i].setItem(newItem);
        slots[i].setSoldOut(false);
    }
}

    private static void displayInventory(VendingMachine vendingMachine){

        ItemShelf[] slots = vendingMachine.getVendingMachineInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }

}

