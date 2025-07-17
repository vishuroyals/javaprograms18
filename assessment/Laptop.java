package assessment;

public class Laptop {
	String OS;
	String Processor;
	int RAM;
	String Brand;
	String Color;
	double Price;

	public static void main(String[] args) {
		Laptop obj1 = new Laptop();
		obj1.OS = "WINDOWS 11";
		obj1.Processor = "Intel Core i5";
		obj1.RAM = 16;
		obj1.Brand = "Dell";
		obj1.Color = "Black";
		obj1.Price = 55000.00;
		System.out.println("Laptop Details");
		System.out.println("OS:" + obj1.OS);
		System.out.println("Processor:" + obj1.Processor);
		System.out.println("RAM:" + obj1.RAM);
		System.out.println("Brand:" + obj1.Brand);
		System.out.println("Color:" + obj1.Color);
		System.out.println("Price:" + obj1.Price);
	}
}
