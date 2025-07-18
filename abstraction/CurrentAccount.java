package abstraction;

public class CurrentAccount extends BaseAccount {
    double overdraftLimit;

    public CurrentAccount(String name, long num, double balance, double limit) {
        super(name, num, balance);
        this.overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + " and  Remaining Balance: $" + balance);
        } else {
            System.out.println("Withdrawal  overdraft limit!");
        }
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: $" + this.overdraftLimit);
    }
}
