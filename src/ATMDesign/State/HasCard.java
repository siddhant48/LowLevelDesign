package ATMDesign.State;

import ATMDesign.ATM;
import ATMDesign.Card;

public class HasCard extends ATMState{
    @Override
    public void validatePin(ATM atm, Card card, String pin) {
        if(!card.getPin().equals(pin)){
           System.out.println("Enter Correct PIN!!");
        }else{
            System.out.println("Atm pin validated !!");
            atm.setAtmState(new ChoseOperation());
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
