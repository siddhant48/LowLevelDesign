package ATMDesign.State.CashProcessor;

import ATMDesign.ATM;

public class HundredNotesProcessor extends CashProcessor{
    public HundredNotesProcessor(CashProcessor cashProcessor) {
        super(cashProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount){
        int count = amount/100;
        int remAmount = amount-100*count;
        atm.setHundredNotes(atm.getHundredNotes()-count);
        if(remAmount!=0){
           System.out.println("Please provide the amount in proper denominations");
        }
    }
}
