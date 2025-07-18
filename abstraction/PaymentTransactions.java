package abstraction;

public class PaymentTransactions {
	public static void main(String[] args) {
		CreditCardPayment creditPayment = new CreditCardPayment(101, 5000.75, 1234567812345678L);
		creditPayment.processPayment();
		creditPayment.displayCardPaymentDetails();

		System.out.println("--------------------------------------------------------------------");

		DigitalWalletPayment walletPayment = new DigitalWalletPayment(102, 1500.75, "GooglePay");
		walletPayment.processPayment();
		walletPayment.displayWalletPaymentDetails();
	}
}
