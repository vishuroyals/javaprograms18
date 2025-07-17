package intern;

public class Bike extends Vehicle {
	boolean helmentIncluded;

	public Bike(String v, String b, double rent, boolean h) {
		super(v, b, rent);
		this.helmentIncluded = h;
		// TODO Auto-generated constructor stub
	}

	double calculateRentalCost(int days) {

		return getRentalPrice() * days;

	}
public boolean isHelmentInclude() {
	return helmentIncluded;
}
}
