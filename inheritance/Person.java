package inheritance;

public class Person {
	String Name;
	int age;

	public Person(String Name, int age) {
		System.out.println("Person Class Constructor");
		this.Name = Name;
		this.age = age;
	}

	void displayPersonDetails() {
		System.out.println("Name:" + this.Name);
		System.out.println("Age:" + this.age);
	}

	public static void main(String[] args) {
		Person p = new Person("Smith", 29);
		p.displayPersonDetails();
	}
}
