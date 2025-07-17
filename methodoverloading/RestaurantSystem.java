package methodoverloading;

public class RestaurantSystem {
	void placeOrder() {
		System.out.println("Takes Orders in Different Ways");
	}

	void placeOrder(String s) {
		System.out.println("A Regular Order");

	}

	void placeOrder(String s, int i) {
		System.out.println("Bulk Orders");
	}

	void placeOrder(String s, int i, String h) {
		System.out.println("Special instructions and Custom orders");
	}

	public static void main(String[] args) {
		RestaurantSystem s = new RestaurantSystem();
		s.placeOrder();
		s.placeOrder("Paneer");
		s.placeOrder("Kaju Briyani", 10);
		s.placeOrder("Panner Briyani", 10, "Panner Tikka");
	}
}
