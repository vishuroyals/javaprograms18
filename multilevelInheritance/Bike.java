package multilevelInheritance;

public class Bike extends Vehicle {
	String Model;
	int SeatingCapacity;
	int Gears;
	int Mileage;

	public Bike(String s, int p, String e, String ss, int se, int g, int m) {
		super(s, p, e);
		Color = s;
		Price = p; 
		Engine = e;
		Model = ss;
		SeatingCapacity = se;
		Gears = g;
		Mileage = m;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Bike b1 = new Bike("Black", 120000, "Hybrid Engine", "ABC", 4, 5, 10);
		System.out.println("Color:" + b1.Color);
		System.out.println("Price:" + b1.Price);
		System.out.println("Engine:" + b1.Engine);
		System.out.println("Model:" + b1.Model);
		System.out.println("Seating Capacity:" + b1.SeatingCapacity);
		System.out.println("Gears:" + b1.Gears);
		System.out.println("Milegae:" + b1.Mileage);
	}

}
