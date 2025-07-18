package constructors;

public class VariableShadowing {
	String name = "Ram"; // Instance variables
	int age = 45; // Instance variables

	void display() {
		String name = "Krishna"; // local variable
		int age = 24; // local variable
		System.out.println("Name is:" + name); // access instance variables
		System.out.println("Age is:" + age);
		System.out.println("Name is :" + this.name); // access local variables
		System.out.println("Age is:" + this.age);
	}

	public static void main(String[] args) {
		VariableShadowing obj = new VariableShadowing();
		obj.display();
	}
}
