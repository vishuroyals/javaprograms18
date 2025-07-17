package assessment;

public class BankAcc {
	long AccountNum;
	String TypeOfAcc;
	String AccHolderName;
	double Balance;

	public static void main(String[] args) {
		BankAcc obj1 = new BankAcc();
		obj1.AccountNum = 1234567890l;
		obj1.TypeOfAcc = "SavingsAccount";
		obj1.AccHolderName = "Smith";
		obj1.Balance = 9887.05;
		System.out.println("Bank Account Details");
		System.out.println("Account Number= " + obj1.AccountNum);
		System.out.println("Type Of Account=" + obj1.TypeOfAcc);
		System.out.println("Account Holder Name=" + obj1.AccHolderName);
		System.out.println("Balance=" + obj1.Balance);

	}
}
