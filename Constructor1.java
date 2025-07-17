package oops;

public class Constructor1 {
	String name;
	int age;

	public Constructor1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void getData() {
		System.out.println("Name of the Student is :" + this.name);
		System.out.println("Student age is:" + this.age);
	}
	public static void main(String[] args) {
		Constructor1 obj = new Constructor1("virat", 18);
		obj.getData();

	}
}
