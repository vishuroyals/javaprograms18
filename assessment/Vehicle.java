package assessment;

public class Vehicle {
	String VehicleType;
	String Brand;
	String YearOfManufacture;

	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.VehicleType = "ABC";
		obj.Brand = "XYZ";
		obj.YearOfManufacture = "01-10-1946";
		System.out.println("Vehicle Details");
		System.out.println("Vehicle Type:" + obj.VehicleType);
		System.out.println("Brand:" + obj.Brand);
		System.out.println("Manfactured Year:" + obj.YearOfManufacture);

	}
}
