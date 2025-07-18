package abstraction;

public class BankSystem {
	public static void main(String[] args) {
		// Creating individual BankAccount objects
		SavingsAccount acc1 = new SavingsAccount("Starc", 101001, 5000, 3);
		CurrentAccount acc2 = new CurrentAccount("Hardik", 102002, 2000, 1000);
		SavingsAccount acc3 = new SavingsAccount("Rahul", 103003, 6000, 4);
		CurrentAccount acc4 = new CurrentAccount("David ", 104004, 2500, 1500);

		acc1.displayAccountDetails();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		acc2.displayAccountDetails();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		acc3.displayAccountDetails();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println();
		acc4.displayAccountDetails();
	}
}
