package inheritance;

public class BankAccount {
	String AccNum;
	double balance;

	public BankAccount(String AccNum, double balance) {
		System.out.println("BankAccount Class Constructor");
		this.AccNum = AccNum;
		this.balance = balance;
	}

	void displayAccountDetails() {
		System.out.println("Account Number:" + this.AccNum);
		System.out.println("Balance:" + this.balance);
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("1234567890", 6790.0987);
		b1.displayAccountDetails();
	}
}
