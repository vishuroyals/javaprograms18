package intern;

public class SchoolManagement {
	public static void main(String[] args) {
		Student1 s1 = new Student1("Scott", 20, "ATP", 101, "A");
		Teacher t1 = new Teacher("John", 40, "NYC", 201, 55000.50);

		System.out.println("Student Details:");
		System.out.println("Name: " + s1.getName());
		System.out.println("Age: " + s1.getAge());
		System.out.println("Address: " + s1.getAddress());
		System.out.println("Student ID: " + s1.getStudentId());
		System.out.println("Grade: " + s1.getGrade());

		System.out.println("\nTeacher Details:");
		System.out.println("Name: " + t1.getName());
		System.out.println("Age: " + t1.getAge());
		System.out.println("Address: " + t1.getAddress());
		System.out.println("Teacher ID: " + t1.getTeacherId());
		System.out.println("Salary: " + t1.getSalary());
	}
}
