package ATMDesign;

public class BankAccount {
    int bankBalance;

    public int getBankBalance() {
        return bankBalance;
    }

    public void deductBalance(int amount){
        if(amount>bankBalance){
            System.out.println("amount is more than bank balance!!");
        }else{
            bankBalance -= amount;
        }
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }
}
