package abstraction;

public class OnlineShoppingSystem {
	public static void main(String[] args) {

		Electronics e1 = new Electronics("Laptop", "Electronics", 1000.0, 2);
		Electronics e2 = new Electronics("Mobile", "Electronic", 15000.0, 3);
		e1.displayProductDetails();
		e2.displayProductDetails();
	}
}
