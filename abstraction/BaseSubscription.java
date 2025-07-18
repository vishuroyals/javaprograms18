package abstraction;

public class BaseSubscription implements Subscription {
	int subscriptionId;
	double price;

	public BaseSubscription(int id, double price) {
		this.subscriptionId = id;
		this.price = price;
	}

	@Override
	public void calcualteBillingAmount() {
		System.out.println("Subscription ID: " + this.subscriptionId);
		System.out.println("Price: " + this.price);

	}
}
