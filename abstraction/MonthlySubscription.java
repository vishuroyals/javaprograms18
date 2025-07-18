package abstraction;

public class MonthlySubscription extends BaseSubscription {

    public MonthlySubscription(int id, double price) {
        super(id, price);
    }

    public void calculateBillingAmount() {
        System.out.println("Monthly Subscription - ID: " + this.subscriptionId);
        System.out.println("Monthly Price: " + this.price);
    }
}
