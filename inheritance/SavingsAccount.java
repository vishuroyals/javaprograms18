package inheritance;

public class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount(String AccNum, double balance, double interestRate) {
		super(AccNum, balance);
		this.interestRate = interestRate;
		System.out.println("Saving Account  class Constructor");
	}

	void calculateInterest() {
		double interest = balance * (interestRate / 100);
		System.out.println("Calculating Interest Rate ");
	}

	void displayAll() {
		System.out.println("Account Number:" + this.AccNum);
		System.out.println("Balance:" + this.balance);
		System.out.println("Interest:" + this.interestRate + "%");
	}

	public static void main(String[] args) {
		SavingsAccount s1 = new SavingsAccount("123456789", 6790.0987, 1234.8798765);
		s1.calculateInterest();
		s1.displayAll();
	}

}
