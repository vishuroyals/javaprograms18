package oops;

class Address {
	String City;
	String state;

	Address(String city, String state) {
		this.City = city;
		this.state = state;
	}
}

class Person1 {
	String Name;
	int age;
	Address address; // reference variable
	// Construtor

	Person1(String name, int age, Address address) {
		this.Name = name;
		this.age = age;
		this.address = address;
	}
  
	// CopyCOnstructor(Shallow Copy)
	Person1(Person1 p) {
		this.Name = p.Name;
		this.age = p.age;
		this.address = p.address; // shallow copy(just copying the reference)
	}

	void details() {
		System.out.println("Name:" + this.Name);
		System.out.println("Age:" + this.age);
		System.out.println("State:" + address.state);
		System.out.println("City:" + address.City);

	}
}

public class Person2 {
	public static void main(String[] args) {
		Address adr = new Address("ATP", "AP");
		Person1 p1 = new Person1("Sam", 19, adr);
		Person1 p2 = new Person1(p1); // shallow copy
		System.out.println("Before Modifications:");
		p1.details();
		p2.details(); // shallow copy
		// modifying the variable
		p2.address.City = "Kurnool";
		System.out.println("After Modifications:");
		p1.details();
		p2.details();
	}
}
