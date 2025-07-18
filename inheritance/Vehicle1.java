package inheritance;

public class Vehicle1 {
	String Color;
	int Price;
	String Brand;
	int Mileage;

	public Vehicle1(String Color, int Price, String Brand, int Mileage) {
		System.out.println("Vehicle class Constructor");
		this.Color = Color;
		this.Price = Price;
		this.Brand = Brand;
		this.Mileage = Mileage;
	}

	public static void main(String[] args) {
		Vehicle1 v1 = new Vehicle1("Black", 100000, "XYZ", 15);
	}
}
