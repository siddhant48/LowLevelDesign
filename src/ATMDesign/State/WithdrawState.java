package ATMDesign.State;

import ATMDesign.ATM;
import ATMDesign.Card;
import ATMDesign.State.CashProcessor.CashProcessor;
import ATMDesign.State.CashProcessor.FiveHundredNotesProcessor;
import ATMDesign.State.CashProcessor.HundredNotesProcessor;
import ATMDesign.State.CashProcessor.TwoHundredNotesProcessor;

public class WithdrawState extends ATMState{

    @Override
    public void withdrawal(ATM atm, Card card, int amountToWithdraw) {
        if(atm.getAtmBalance() < amountToWithdraw){
            System.out.println("ATM doesn't have Sufficient Amount !!");
        }else if(card.getBankAccount().getBankBalance() < amountToWithdraw){
            System.out.println("Bank Account has Insufficient Amount!!");
        }else{
            CashProcessor cashProcessor = new FiveHundredNotesProcessor(new TwoHundredNotesProcessor(new HundredNotesProcessor(null)));
            cashProcessor.withdraw(atm,amountToWithdraw);
            card.getBankAccount().deductBalance(amountToWithdraw);
            atm.setAtmBalance(atm.getAtmBalance() - amountToWithdraw);
            exit(atm,card);
        }
    }

    @Override
    public void returnCard(ATM atm, Card card) {
        System.out.println("Please collect you card!!");
    }

    @Override
    public void exit(ATM atm, Card card) {
        returnCard(atm,card);
        atm.setAtmState(new IdleState());
        System.out.println("System has exit !!");
    }
}
