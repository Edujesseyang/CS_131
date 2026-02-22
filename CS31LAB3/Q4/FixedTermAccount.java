package CS31LAB3.Q4;

import java.time.LocalDateTime;

public class FixedTermAccount extends BankAccount{
    private final int TERM_LENGTH = 3;
    private LocalDateTime termEndDate;
    public FixedTermAccount(String holderName, String password) {
        super(holderName, password);
        LocalDateTime now = LocalDateTime.now();
        this.termEndDate = now.plusYears(TERM_LENGTH);
    }

    public void withdraw(double amount){
        LocalDateTime now = LocalDateTime.now();
        if(now.isBefore(termEndDate)){
            System.out.println("Withdraw is not allowed on before term ends");
            return;
        }

        if(balance - amount >= 0){
            balance -= amount;
        } else {
            System.out.println("Not enough money");
        }
    }
}
