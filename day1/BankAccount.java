package day1;

public class BankAccount {
	int AccNum;
	String TypeOfAcc;
	String AccHoldName;
	int Balance;
	public static void main(String[] args) {
		BankAccount B1 = new BankAccount();
		B1.AccNum = 1234567890;
		B1.TypeOfAcc = "SavingsAccount";
		B1.AccHoldName = "Virat";
		B1.Balance = 890010;
		System.out.println("AccountNumber:" + B1.AccNum);
		System.out.println("Type of Account:" + B1.TypeOfAcc);
		System.out.println("Account Holder Name:" + B1.AccHoldName);
		System.out.println("Balance:" + B1.Balance);
		System.out.println("--------------------------------------");
		BankAccount B2 = new BankAccount();
		B2.AccNum = 1234567890;
		B2.TypeOfAcc = "Joint Account";
		B2.AccHoldName = "Rohith";
		B2.Balance = 69010;
		System.out.println("AccountNumber:" + B2.AccNum);
		System.out.println("Type of Account:" + B2.TypeOfAcc);
		System.out.println("Account Holder Name:" + B2.AccHoldName);
		System.out.println("Balance:" + B2.Balance);
		BankAccount B3 = new BankAccount();
		B3.AccNum = 1234567890;
		B3.TypeOfAcc = "SavingsAccount";
		B3.AccHoldName = "Rinku";
		B3.Balance = 890010;
		System.out.println("AccountNumber:" + B3.AccNum);
		System.out.println("Type of Account:" + B3.TypeOfAcc);
		System.out.println("Account Holder Name:" + B3.AccHoldName);
		System.out.println("Balance:" + B3.Balance);
		System.out.println("--------------------------------------");
		BankAccount B4 = new BankAccount();
		B4.AccNum = 1234567890;
		B4.TypeOfAcc = "Joint Account";
		B4.AccHoldName = "Surya";
		B4.Balance = 69010;
		System.out.println("AccountNumber:" + B4.AccNum);
		System.out.println("Type of Account:" + B4.TypeOfAcc);
		System.out.println("Account Holder Name:" + B4.AccHoldName);
		System.out.println("Balance:" + B4.Balance);
		System.out.println("--------------------------------------");
		BankAccount B5= new BankAccount();
		B5.AccNum = 1234567890;
		B5.TypeOfAcc = "Joint Account";
		B5.AccHoldName = "Hardik";
		B5.Balance = 69010;
		System.out.println("AccountNumber:" + B5.AccNum);
		System.out.println("Type of Account:" + B5.TypeOfAcc);
		System.out.println("Account Holder Name:" + B5.AccHoldName);
		System.out.println("Balance:" + B5.Balance);
		


	}
}
