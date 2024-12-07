package ATMDesign;

import ATMDesign.State.ATMState;
import ATMDesign.State.IdleState;

public class ATM {
    private ATMState atmState;
    private int atmBalance;
    private int hundredNotes;
    private int twoHundredNotes;
    private int fiveHundredNotes;
    private static ATM atmInstance;
    private ATM(){
        this.atmState = new IdleState();
        System.out.println("ATM instance is created !!");
    }

    public static ATM getInstance(){
        if(atmInstance == null){
            atmInstance = new ATM();
        }
        return atmInstance;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    public int getHundredNotes() {
        return hundredNotes;
    }

    public void setHundredNotes(int hundredNotes) {
        this.hundredNotes = hundredNotes;
    }

    public int getTwoHundredNotes() {
        return twoHundredNotes;
    }

    public void setTwoHundredNotes(int twoHundredNotes) {
        this.twoHundredNotes = twoHundredNotes;
    }

    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public void setFiveHundredNotes(int fiveHundredNotes) {
        this.fiveHundredNotes = fiveHundredNotes;
    }
    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("200Notes: " + twoHundredNotes);
        System.out.println("500Notes: " + fiveHundredNotes);
        System.out.println("100Notes: " + hundredNotes);

    }

}
