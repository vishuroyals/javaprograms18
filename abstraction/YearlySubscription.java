package abstraction;

public class YearlySubscription extends BaseSubscription {

    public YearlySubscription(int id, double price) {
        super(id, price);
    }

    public void calculateBillingAmount() {
        double yearlyPrice = price * 12; 
        System.out.println("Yearly Subscription - ID: " + this.subscriptionId);
        System.out.println("Yearly Price: " + yearlyPrice);
    }
}
