package intern;

public class VehicleRentalSystem {
	public static void main(String[] args) {
		Car obj = new Car("2345678", "ABc", 1200.780, 5);
		Bike obj1 = new Bike("1234567890", "XYZ", 9087.230, true);
		System.out.println("Car rental for 8 days:" + obj.calculateRentalCost(8));
		System.out.println("Bike rental for 5 days:" + obj.calculateRentalCost(5));
		System.out.println("Car has " + obj.getnumberOfDoors() + "doors");
		System.out.println("Bike rider comes with helment:" + obj1.helmentIncluded);
	}
}
