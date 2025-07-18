package multilevelInheritance;

public class Vehicle {
	String Color;
	int Price;
	String Engine;

	public Vehicle(String s, int p, String e) {
		Color = s;
		Price = p;
		Engine = e;
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Red", 120000, "Electrical Engine");
		System.out.println("Color:" + v1.Color);
		System.out.println("Price:" + v1.Price);
		System.out.println("Engine:" + v1.Engine);
	}
}
