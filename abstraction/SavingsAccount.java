package abstraction;

public class SavingsAccount extends BaseAccount {
    double interestRate;

    public SavingsAccount(String name, long num, double balance, double rate) {
        super(name, num, balance);
        this.interestRate = rate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " and  Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }
}
