package oops;

class Student {
	String name;
	int age;

	public void getInfo() {
		System.out.println("Student Name is:" + this.name);
		System.out.println("Student Age is:" + this.age);
	}
}

public class Program1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Krishna";
		s1.age = 20;
		s1.getInfo();
		System.out.println("************************************");
		Student s2 = new Student();
		s2.name = "Krishna";
		s2.age = 20;
		s2.getInfo();
	}
}
