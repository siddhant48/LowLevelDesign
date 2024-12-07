package ATMDesign.State.CashProcessor;

import ATMDesign.ATM;

public class FiveHundredNotesProcessor extends CashProcessor{

    public FiveHundredNotesProcessor(CashProcessor cashProcessor) {
        super(cashProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount){
        int count = amount/500;
        int remAmount = amount-500*count;
        atm.setFiveHundredNotes(atm.getFiveHundredNotes()-count);
        if(remAmount!=0){
            super.withdraw(atm,remAmount);
        }
    }
}
