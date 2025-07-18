package constructors;

public class Student1 {
	String City = "Banglore";

	Student1(String City) {
		System.out.println(City);
		System.out.println(this.City);

	}

	public static void main(String[] args) {
		Student1 obj = new Student1("Delhi");

	}
}
 