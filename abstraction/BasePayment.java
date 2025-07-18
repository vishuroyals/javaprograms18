package abstraction;

public class BasePayment implements PaymentMethod {
	int payment_id;
	double amount;

	public BasePayment(int payment_id, double amount) {
		this.payment_id = payment_id;
		this.amount = amount;
	}

	@Override
	public void processPayment() {
		System.out.println("Payment in Processing, please wait.......!");
	}

	public void displayPaymentDetails() {
		System.out.println("Payment ID: " + payment_id);
		System.out.println("Amount: $" + amount);
	}
}
