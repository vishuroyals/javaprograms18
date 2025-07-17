package day1;

public class CarShowRoom {
	String Model_Name;
	double Price;
	String Color;
	static String Brand_Name;

	public static void main(String[] args) {
		CarShowRoom C1 = new CarShowRoom();
		C1.Model_Name = "XXX";
		C1.Price = 123456l;
		C1.Color = "Black";
		Brand_Name = "TATA";
		System.out.println("Model Name:" + C1.Model_Name);
		System.out.println("Price:" + C1.Price);
		System.out.println("Color:" + C1.Color);
		System.out.println("Brand Name:" + CarShowRoom.Brand_Name);

	}
}
