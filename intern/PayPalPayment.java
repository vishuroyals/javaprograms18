package intern;

public class PayPalPayment extends Payment {

	public PayPalPayment(String transactionId, double amount) {
		super(transactionId, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double processPayment() {
		return amount + (amount * 0.03);
	}

}
