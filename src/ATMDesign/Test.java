package ATMDesign;

public class Test {
    ATM atm = ATM.getInstance();
    User user;
    public static void main(String[] args) {
        Test test = new Test();
        test.initialize();
        test.atm.printCurrentATMStatus();
        test.atm.getAtmState().insertCard(test.atm,test.user.getCard());
        test.atm.getAtmState().validatePin(test.atm,test.user.getCard(),"1234");
        test.atm.getAtmState().choseOperation(test.atm,OperationType.WITHDRAWAL,test.user.getCard());
        test.atm.getAtmState().withdrawal(test.atm,test.user.getCard(),2800);
        test.atm.printCurrentATMStatus();
    }

    private void initialize(){
        atm.setAtmBalance(4600);
        atm.setFiveHundredNotes(7);
        atm.setTwoHundredNotes(3);
        atm.setHundredNotes(5);
        this.user = userInitialize();
    }

    private User userInitialize(){
        User user= new User();
        user.setCard(createCard());
        return user;
    }
    private Card createCard(){

        Card card = new Card();
        card.setName("Siddhant");
        card.setCvv("745");
        card.setBankAccount(createBankAccount());
        return card;
    }

    private BankAccount createBankAccount() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankBalance(3000);

        return bankAccount;

    }

}
