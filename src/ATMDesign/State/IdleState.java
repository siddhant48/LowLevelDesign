package ATMDesign.State;

import ATMDesign.ATM;
import ATMDesign.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Hello "+ card.getName()+"!!");
        atm.setAtmState(new HasCard());
    }
}
