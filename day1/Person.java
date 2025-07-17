package day1;

public class Person {
	String Name;
	int age;
	static String Nationality = "Indian";
	static String identity = "Aadhar";

	public static void main(String[] args) {
		System.out.println(Person.Nationality);
		System.out.println(Person.identity);
		Person P1 = new Person();
		P1.Name = "Scott";
		P1.age = 20;
		System.out.println("Name=" + P1.Name);
		System.out.println("Age=" + P1.age);
		System.out.println("-----------------------------------------");
		System.out.println(Person.Nationality);
		System.out.println(Person.identity);
		Person P2 = new Person();
		P2.Name = "Smith";
		P2.age = 22;
		System.out.println("Name=" + P2.Name);
		System.out.println("Age=" + P2.age);
		System.out.println("-----------------------------------------");
		System.out.println(Person.Nationality);
		System.out.println(Person.identity);
		Person P3 = new Person();
		P3.Name = "Shil";
		P3.age = 26;
		System.out.println("Name=" + P3.Name);
		System.out.println("Age=" + P3.age);
		System.out.println("-----------------------------------------");
		System.out.println(Person.Nationality);
		System.out.println(Person.identity);
		Person P4 = new Person();
		P4.Name = "Snow";
		P4.age = 29;
		System.out.println("Name=" + P4.Name);
		System.out.println("Age=" + P4.age);
		System.out.println("-----------------------------------------");
		System.out.println(Person.Nationality);
		System.out.println(Person.identity);
		Person P5 = new Person();
		P5.Name = "Surya";
		P5.age = 30;
		System.out.println("Name=" + P5.Name);
		System.out.println("Age=" + P5.age);
	}
}
