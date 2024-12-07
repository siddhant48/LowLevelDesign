package ATMDesign.State.CashProcessor;

import ATMDesign.ATM;

public class TwoHundredNotesProcessor extends CashProcessor {
    public TwoHundredNotesProcessor(CashProcessor cashProcessor) {
        super(cashProcessor);
    }

    @Override
    public void withdraw(ATM atm, int amount){
        int count = amount/200;
        int remAmount = amount-200*count;
        atm.setTwoHundredNotes(atm.getTwoHundredNotes()-count);
        if(remAmount!=0){
            super.withdraw(atm,remAmount);
        }
    }
}
