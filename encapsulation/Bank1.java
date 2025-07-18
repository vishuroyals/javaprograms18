package encapsulation;

public class Bank1 {
	public static void main(String[] args) {
		BankAcc b1 = new BankAcc();
		b1.setAccNum("123456789");
		b1.setAccHolderName("Scoot");
		b1.setBalance(123.456789);
		System.out.println("Account Number:" + b1.getAccNum());
		System.out.println("Account Holder Name:" + b1.getAccHolderName());
		System.out.println("Balance:" + b1.getBalance());
	}
}
 