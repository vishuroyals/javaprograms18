package stringsbasic;

public class StringExample2 {
	public static void main(String[] args) {
		String firstName = "Golla";
		String lastName = "Swathi";

		// Using + operator
		String fullName = firstName + " " + lastName;
		System.out.println("Full Name: " + fullName);

		// Using concat() method
		String fullName2 = firstName.concat(" ").concat(lastName);
		System.out.println("Full Name using concat(): " + fullName2);
	}
}
