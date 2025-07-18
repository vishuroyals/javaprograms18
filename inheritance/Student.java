package inheritance;

public class Student {
	String name;
	int rollnum;

	public Student(String name, int rollnum) {
		System.out.println("Student Class Constructor");
		this.name = name;
		this.rollnum = rollnum;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Scott", 10);
	}
}
