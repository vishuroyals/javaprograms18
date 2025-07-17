package intern;
class FoodItem {
	private String itemName;
	private double price;

	public FoodItem(String itemName, double price) {
		this.itemName = itemName;
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public double calculateBill() {
		return price;
	}
}

class Beverage extends FoodItem {
	public Beverage(String itemName, double price) {
		super(itemName, price);
	}

	@Override
	public double calculateBill() {
		return getPrice() + (getPrice() * 0.05); // 5% tax
	}
}

class MainCourse extends FoodItem {
	public MainCourse(String itemName, double price) {
		super(itemName, price);
	}

	@Override
	public double calculateBill() {
		return getPrice() + (getPrice() * 0.10); // 10% tax
	}
}

public class RestaurantBilling {
	public static void main(String[] args) {
		FoodItem item1 = new Beverage("soft drinks", 50);
		FoodItem item2 = new MainCourse("Paneer", 200);

		System.out.println("Restaurant Bill:");
		System.out.println(item1.getItemName() + " - Total Price: ₹" + item1.calculateBill());
		System.out.println(item2.getItemName() + " - Total Price: ₹" + item2.calculateBill());
	}
}