package oops;

class Duplicate2 {
	String Name;
	int age;
	String Gender;
	int phno;

	Duplicate2(String n, int a, String s, int p) {
		this.Name = n;
		this.age = a;
		this.Gender = s;
		this.phno = p;
	}

	Duplicate2(Duplicate2 d) {
		this.Name = d.Name;
		this.age = d.age;
		this.Gender = d.Gender;
		this.phno = d.phno;
	}

	void showDetails() {
		System.out.println("Person's Name:" + this.Name);
		System.out.println("Person's Age:" + this.age);
		System.out.println("Gender:" + this.Gender);
		System.out.println("Contact Number:" + this.phno);

	}

	public class Person {
		public static void main(String[] args) {
			Duplicate2 d1 = new Duplicate2("Pant", 12, "Male", 123456789);
			Duplicate2 d2 = new Duplicate2(d1);
			d2.showDetails();
		}
	}
}
