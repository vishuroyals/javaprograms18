package inheritance2;

// Parent class
public class BankAccount {
	String AccNum;
	double balance;

	public BankAccount(String AccNum, double balance) {
		System.out.println("BankAccount Class Constructor");
		this.AccNum = AccNum;
		this.balance = balance;
	}

	void displayAccountDetails() {
		System.out.println("Account Number: " + this.AccNum);
		System.out.printf("Balance: %.2f%n", this.balance);
	}
}

// Child class
class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount(String AccNum, double balance, double interestRate) {
		super(AccNum, balance); // Call the constructor of the superclass
		this.interestRate = interestRate;
		System.out.println("SavingsAccount Class Constructor");
	}

	void displayAllDetails() {
		// Reuse the method from the superclass to display account details
		super.displayAccountDetails();
		System.out.println("Interest Rate: " + this.interestRate + "%");
	}
}

// Main class
class TestInheritance {
	public static void main(String[] args) {
		// Create a SavingsAccount object
		SavingsAccount savingsAccount = new SavingsAccount("9876543210", 10000.75, 4.5);

		// Display all details of the savings account
		savingsAccount.displayAllDetails();
	}
}
