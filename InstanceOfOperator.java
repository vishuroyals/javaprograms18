package operators;

public class InstanceOfOperator {
	public static void main(String[] args) {
		String name = "Swathi";
		System.out.println("Is name an instance of String? " + (name instanceof String));
		Integer number = 100;
		System.out.println("Is number an instance of Integer? " + (number instanceof Integer));
	}
}