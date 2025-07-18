package abstraction;

public class FoodDeliverySystem {
	public static void main(String[] args) {
		Restaurant r1 = new Restaurant("ABC Restaurant", 100, "ATP");
		Restaurant r2 = new Restaurant("XYZ Restaurant", 101, "BLR");

		Order o1 = new Order("Virat", 200, 340);
		Order o2 = new Order("Rohit", 201, 550);
		r1.displayDetails();
		r2.displayDetails();
		o1.displayDetails();
		o2.displayDetails();
	}
}
