package internship;

public class Child extends Parent {
	void displayMessage() {
		System.out.println("I am a Child");
	}

	public static void main(String[] args) {

		GrandParent gp = new GrandParent();
		gp.displayMessage();
		Parent p = new Parent();
		p.displayMessage();
		Child c = new Child();
		c.displayMessage();

	}
}
