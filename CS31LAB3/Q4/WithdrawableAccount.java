package CS31LAB3.Q4;

public class WithdrawableAccount extends BankAccount {
    public WithdrawableAccount(String holderName, String password) {
        super(holderName, password);
    }

    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("Not enough money");
        }
    }
}
