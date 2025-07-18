 package multilevelInheritance;

public class SuperBike extends Bike {
	String Suspension;
	String Technology;

	public SuperBike(String s, int p, String e, String ss, int se, int g, int m, String su, String Te) {
		super(s, p, e, ss, se, g, m);
		Color = s;
		Price = p;
		Engine = e;
		Model = ss;
		SeatingCapacity = se;
		Gears = g;
		Mileage = m;
		Suspension = su;
		Technology = Te;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SuperBike Sb1 = new SuperBike("Black", 120000, "Hybrid Engine", "ABC", 4, 5, 10, "30 mm", "ABS");
		System.out.println("Color:" + Sb1.Color);
		System.out.println("Price:" + Sb1.Price);
		System.out.println("Engine:" + Sb1.Engine);
		System.out.println("Model:" + Sb1.Model);
		System.out.println("Seating Capacity:" + Sb1.SeatingCapacity);
		System.out.println("Gears:" + Sb1.Gears);
		System.out.println("Milegae:" + Sb1.Mileage);
		System.out.println("Suspension:" + Sb1.Suspension);
		System.out.println("Technology:" + Sb1.Technology);
	}

}
