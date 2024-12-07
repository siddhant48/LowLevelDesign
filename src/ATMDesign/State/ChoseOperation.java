package ATMDesign.State;

import ATMDesign.ATM;
import ATMDesign.Card;
import ATMDesign.OperationType;

public class ChoseOperation extends ATMState{
    @Override
    public void choseOperation(ATM atm, OperationType operationType, Card card) {
        switch (operationType){
            case WITHDRAWAL:
                System.out.println("Operation Type: Withdrawal");
                atm.setAtmState(new WithdrawState());
                break;
            case CHECK_BALANCE:
                System.out.println("Operation Type: Check Balance");
                atm.setAtmState(new CheckBalanceState());
                break;
            default:
                exit(atm,card);
               System.out.println("Operation not found!!");

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
