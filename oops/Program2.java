package oops;

class Pen {
	String color;
	String type;

	public void printColor() {
		System.out.println("The Pen Color is :" + this.color);
		System.out.println("The Pen type is :" + this.type);
	}
}
public class Program2 {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.color = "Black";
		p1.type = "Ball-Type";
		Pen p2 = new Pen();
		p2.color = "Blue";
		p2.type = "Gel";
		Pen p3 = new Pen();
		p3.color = "Red";
		p3.type = "Fountain";
		p1.printColor();
		p2.printColor();
		p3.printColor();
	}
}
