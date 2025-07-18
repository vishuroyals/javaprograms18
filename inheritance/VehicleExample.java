package inheritance;

public class VehicleExample {
	String Color;
	int price;
	String Brand;
	int SeatingCapacity;
	int Milegae;

	void DisplayDetails() {
		System.out.println("Color:" + this.Color);
		System.out.println("Price:" + this.price);
		System.out.println("Brand:" + this.Brand);
		System.out.println("Seating Capacity:" + this.SeatingCapacity);
		System.out.println("Mileage:" + this.Milegae);

	}

	public static void main(String[] args) {
		VehicleExample obj = new VehicleExample();
		obj.Color = "Red";
		obj.price = 112000;
		obj.Brand = "Tata";
		obj.SeatingCapacity = 4;
		obj.Milegae = 200;
		obj.DisplayDetails();
	}
}
