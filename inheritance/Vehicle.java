package inheritance;

public class Vehicle {
	String model;
	double rentalPrice;

	public Vehicle(String model, double rentalPrice) {
		System.out.println("Vehicle Class Constructor");
		this.model = model;
		this.rentalPrice = rentalPrice;
	}

	void displayVehicleDetails() {
		System.out.println("Model:" + this.model);
		System.out.println("Rental Price:" + this.rentalPrice);
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle("XYZ", 4567.98);
		v.displayVehicleDetails();
	}
}
