package constructors;

public class Student {
	String Name;
	int rollnumber;
	String Course;
	int Marks;

	public Student(String name, int roll, String course, int marks) {
		System.out.println("**************************************************");
		Name = name;
		rollnumber = roll;
		Course = course;
		Marks = marks;
	}

	void Details() {
		System.out.println("Student Name is:" + this.Name);
		System.out.println("Student Roll number is :" + this.rollnumber);
		System.out.println("Course is:" + this.Course);
		System.out.println("Marks:" + this.Marks);

	}

	public static void main(String[] args) {
		Student S1 = new Student("Swathi", 101, "java", 99);
		S1.Details();
	}
}
