package intern;

public class PaymentSystem {
	public static void main(String[] args) {
		Payment obj = new CreditCardPayment("TXN12345", 1000);
		Payment obj1 = new PayPalPayment("TXN68967890", 1000);
		System.out.println("CreditCard Total :" + obj.processPayment());
		System.out.println("Paypal Payment Total :" + obj.processPayment());

	}
}
