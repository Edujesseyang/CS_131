package lab3.Q4;

public class BankAccount {
    protected String holderName;
    protected String password;
    protected double balance;

    public BankAccount(String holderName, String password) {
        this.holderName = holderName;
        this.password = password;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
