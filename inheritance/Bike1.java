package inheritance;

public class Bike1 extends Vehicle {
	boolean hasHelment;

	public Bike1(String model, double rentalPrice, boolean hasHelment) {
		super(model, rentalPrice);
		this.hasHelment = hasHelment;
		// TODO Auto-generated constructor stub
		System.out.println("Bike1 Class Constructor");
	}

	void display() {
		System.out.println("Model:" + this.model);
		System.out.println("Rental Price:" + this.rentalPrice);
		System.out.println("Has Helement:" + this.hasHelment);
	}

	public static void main(String[] args) {
		Bike1 b = new Bike1("XYZ", 4567.98, true);
		b.display();
	}

}
