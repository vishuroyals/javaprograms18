package abstraction;

public class RemoteControl {
	public static void main(String[] args) {
		Tv obj1 = new Tv();
		obj1.turnON();
		obj1.turnOff();
		System.out.println("***************************");
		Fan1 obj2 = new Fan1();
		obj2.turnON();
		obj2.turnOff();
		System.out.println("***************************");

		Ac obj3 = new Ac();
		obj3.turnON();
		obj3.turnOff();
		System.out.println("***************************");

		Light obj4 = new Light();
		obj4.turnON();
		obj4.turnOff();
	}
}
