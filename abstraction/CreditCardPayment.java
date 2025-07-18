package abstraction;

public class CreditCardPayment extends BasePayment {
	long cardNumber;

	public CreditCardPayment(int payment_id, double amount, long cardNumber) {
		super(payment_id, amount);
		this.cardNumber = cardNumber;
	}

	@Override
	public void processPayment() {
		System.out.println("Card Payment is in processing...");
	}

	public void displayCardPaymentDetails() {
		System.out.println("Payment ID: " + payment_id);
		System.out.println("Amount: $" + amount);
		System.out.println(" Credit Card Number: **** **** **** " + (cardNumber % 10000)); 
	}
}
