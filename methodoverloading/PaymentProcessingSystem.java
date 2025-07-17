package methodoverloading;

public class PaymentProcessingSystem {
	void processPayment() {
		System.out.println("Enter your card Number for the payment process..");
	}

	void processPayment(long n) {
		System.out.println("Enter your Credit Card Number");
	}

	void processPayment(String c, long a) {
		System.out.println("Enter your account Number and IFSC code");
	}

	void processPayment(String id, double d) {
		System.out.println("Enter your wallet Id and digital wallet payment");
	}

	public static void main(String[] args) {
		PaymentProcessingSystem m = new PaymentProcessingSystem();
		m.processPayment();
		m.processPayment(1230000000000l);
		m.processPayment("123456", 102.23);
		m.processPayment("8569", 20315856622480l);

	}
}
