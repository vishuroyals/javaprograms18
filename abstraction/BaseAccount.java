package abstraction;

public abstract class BaseAccount implements BankAccount {
    String holderName;
    long accountNumber;
    double balance;

    public BaseAccount(String name, long num, double balance) {
        this.holderName = name;
        this.accountNumber = num;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + this.holderName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: $" + this.balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + " and  New Balance: $" + balance);
    }

    public abstract void withdraw(double amount);
}
