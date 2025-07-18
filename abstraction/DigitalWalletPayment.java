package abstraction;

public class DigitalWalletPayment extends BasePayment {
	String walletName;

	public DigitalWalletPayment(int payment_id, double amount, String walletName) {
		super(payment_id, amount);
		this.walletName = walletName;
	}

	@Override
	public void processPayment() {
		System.out.println("Wallet Payment is in Processing...");
	}

	public void displayWalletPaymentDetails() {
		System.out.println("Payment ID: " + payment_id);
		System.out.println("Amount: $" + amount);
		System.out.println("Wallet Name: " + walletName);
	}
}
