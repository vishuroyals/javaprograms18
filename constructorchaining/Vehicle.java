package constructorchaining;

public class Vehicle {
	String VehicleType;
	String Brand;
	String Model;
	int year;

	public Vehicle() {
		System.out.println("New Vehicle Entry Created");
	}

	public Vehicle(String VehicleType) {
		this.VehicleType = VehicleType;
		System.out.println("Vehicle type: " + VehicleType + " registered");
	}

	public Vehicle(String VehicleType, String Brand) {
		this.VehicleType = VehicleType;
		this.Brand = Brand;
		System.out.println("Vehicle " + Brand + " of type " + VehicleType + " registered");
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(" KTM Bike ");
		Vehicle v3 = new Vehicle("KTM", "Bike");

	}
}
