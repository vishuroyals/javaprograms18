package intern;

public class Car extends Vehicle {
	int numberOfDoors;
public Car(String v, String b, double r,int n) {
		super(v, b, r);
		this.numberOfDoors=n;
	}
double calculateRentalCost(int days) {
	 
	return getRentalPrice()*days; 
	
}

int getnumberOfDoors() {
	return numberOfDoors;
	
}

}
