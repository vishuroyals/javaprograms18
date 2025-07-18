package encapsulation;

public class Bank {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.setAccountHolderName("Scoot");
		b1.setAccount_Number(123456789);
		b1.setAccount_type("Savings Account");
		b1.setDeposit(456789);
		b1.setIFSC_code("UBIN123456789");
		System.out.println("Account Holder Name:" + b1.getAccountHolderName());
		System.out.println("Account Number:" + b1.getAccount_Number());
		System.out.println("Account Type:" + b1.getAccount_type());
		System.out.println("Deposit:" + b1.getDeposit());
		System.out.println("IFSC Code:" + b1.getIFSC_code());
		System.out.println("********************************************************************************");
		BankAccount b2 = new BankAccount();
		b2.setAccountHolderName("Smith");
		b2.setAccount_Number(343456789);
		b2.setAccount_type("Savings Account");
		b2.setDeposit(906789);
		b2.setIFSC_code("UBIN123456789");
		System.out.println("Account Holder Name:" + b2.getAccountHolderName());
		System.out.println("Account Number:" + b2.getAccount_Number());
		System.out.println("Account Type:" + b2.getAccount_type());
		System.out.println("Deposit:" + b2.getDeposit());
		System.out.println("IFSC Code:" + b2.getIFSC_code());
		System.out.println("********************************************************************************");

		BankAccount b3 = new BankAccount();
		b3.setAccountHolderName("Sujith");
		b3.setAccount_Number(923456789);
		b3.setAccount_type("Savings Account");
		b3.setDeposit(656789);
		b3.setIFSC_code("UBIN123456789");
		System.out.println("Account Holder Name:" + b3.getAccountHolderName());
		System.out.println("Account Number:" + b3.getAccount_Number());
		System.out.println("Account Type:" + b3.getAccount_type());
		System.out.println("Deposit:" + b3.getDeposit());
		System.out.println("IFSC Code:" + b3.getIFSC_code());
		System.out.println("********************************************************************************");

		BankAccount b4 = new BankAccount();
		b4.setAccountHolderName("Sam");
		b4.setAccount_Number(923456789);
		b4.setAccount_type("Savings Account");
		b4.setDeposit(556789);
		b4.setIFSC_code("UBIN123456789");
		System.out.println("Account Holder Name:" + b4.getAccountHolderName());
		System.out.println("Account Number:" + b4.getAccount_Number());
		System.out.println("Account Type:" + b4.getAccount_type());
		System.out.println("Deposit:" + b4.getDeposit());
		System.out.println("IFSC Code:" + b4.getIFSC_code());
		System.out.println("********************************************************************************");

		BankAccount b5 = new BankAccount();
		b5.setAccountHolderName("Shiv");
		b5.setAccount_Number(723456789);
		b5.setAccount_type("Savings Account");
		b5.setDeposit(456789);
		b5.setIFSC_code("UBIN123456789");
		System.out.println("Account Holder Name:" + b5.getAccountHolderName());
		System.out.println("Account Number:" + b5.getAccount_Number());
		System.out.println("Account Type:" + b5.getAccount_type());
		System.out.println("Deposit:" + b5.getDeposit());
		System.out.println("IFSC Code:" + b5.getIFSC_code());

	}
}
