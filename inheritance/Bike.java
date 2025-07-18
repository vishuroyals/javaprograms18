package inheritance;

public class Bike extends Vehicle1 {

	public Bike(String Color, int Price, String Brand, int Mileage) {
		super(Color, Price, Brand, Mileage);
		System.out.println("Bike class Constructor");
	}

	public static void main(String[] args) {
		Bike b1 = new Bike("Red", 234567, "ABC", 20);
	}

}
