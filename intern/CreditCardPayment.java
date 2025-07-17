package intern;

public class CreditCardPayment extends Payment {

	public CreditCardPayment(String transactionId, double amount) {
		super(transactionId, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double processPayment() {
		return amount + (amount * 0.02);
	}
}
;