package ATMDesign.State.CashProcessor;

import ATMDesign.ATM;

public abstract class CashProcessor {
    CashProcessor nextCashProcessor;
    public CashProcessor(CashProcessor cashProcessor){
        this.nextCashProcessor = cashProcessor;
    }

    public void withdraw(ATM atm, int amount){
        if(nextCashProcessor != null){
            nextCashProcessor.withdraw(atm,amount);
        }
    }
}
