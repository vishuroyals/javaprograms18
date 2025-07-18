package abstraction;

public class SubscriptionManagement {
	public static void main(String[] args) {
		MonthlySubscription m1 = new MonthlySubscription(101, 500);
		YearlySubscription y1 = new YearlySubscription(102, 500);

		m1.calculateBillingAmount();
		System.out.println("------------------------");
		y1.calculateBillingAmount();
	}
}
