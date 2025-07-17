package assessment;

public class Car {
	String Color;
	int Price;
	String Model;
	int speed;
	String Engine;

	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.Color = "Black";
		obj1.Price = 12345678;
		obj1.Model = "Sedan";
		obj1.speed = 120;
		obj1.Engine = "V6";
		System.out.println("Car Details");
		System.out.println("Color: " + obj1.Color);
		System.out.println("Price: " + obj1.Price);
		System.out.println("Model: " + obj1.Model);
		System.out.println("Engine: " + obj1.Engine);
	}
}
