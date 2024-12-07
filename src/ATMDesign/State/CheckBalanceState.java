package ATMDesign.State;

import ATMDesign.ATM;
import ATMDesign.Card;

public class CheckBalanceState extends ATMState{
    @Override
    public void checkBalance(ATM atm, Card card) {
        int balance = card.getBankAccount().getBankBalance();
        System.out.println(balance);
        exit(atm,card); // It depends upon the requirement as we can also move to chose operation state
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
