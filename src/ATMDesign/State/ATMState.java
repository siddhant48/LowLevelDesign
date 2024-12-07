package ATMDesign.State;

import ATMDesign.ATM;
import ATMDesign.Card;
import ATMDesign.OperationType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card){
        System.out.println("This insert card operation is not allowed!!");
    }
    public void validatePin(ATM atm, Card card,String pin){
        System.out.println("This validate pin operation is not allowed!!");
    }
    public void choseOperation(ATM atm, OperationType operationType,Card card){
        System.out.println("This choose operation is not allowed!!");
    }
    public void withdrawal(ATM atm, Card card, int amountToWithdraw){
        System.out.println("This withdrawal operation is not allowed!!");
    }
    public void checkBalance(ATM atm,Card card){
        System.out.println("This check balance operation is not allowed!!");
    }
    public void returnCard(ATM atm, Card card){
        System.out.println("This return card operation is not allowed!!");
    }
    public void exit(ATM atm, Card card){
        System.out.println("This cancel operation is not allowed!!");
    }
}
