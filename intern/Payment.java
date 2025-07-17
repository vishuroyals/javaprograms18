package intern;

public class Payment {
	private String transactionId;
	protected double amount;

	public Payment(String transactionId, double amount) {
		this.transactionId = transactionId;
		this.amount = amount;

	}

	public String getTransactionId() {
		return transactionId;

	}

	public double processPayment() {
		return amount;

	}
}
