package intern;

public class Vehicle {
	protected String VehicleNumber;
	protected String Brand;
	private double RentalPrice;

	public Vehicle(String v, String b, double rent) {

		this.VehicleNumber = v;
		this.Brand = b;
		this.setRentalPrice(rent);
	}

public void setRentalPrice(double rent) {
    if (rent > 0) { 
        RentalPrice = rent;
    } else {
        System.out.println("Rental price cannot be negative or zero.");
    }
}

public double getRentalPrice() {
	return RentalPrice;
}
}
