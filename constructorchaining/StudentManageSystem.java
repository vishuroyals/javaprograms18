package constructorchaining;

public class StudentManageSystem {
	String sName;
	int sID;
	String grade;
	int age;

	// Default Constructor
	public StudentManageSystem() {
//		this("Swathi"); // Calls the single-parameter constructor
		System.out.println("New Student Record Created");
	}

	// Single-Parameter Constructor
	public StudentManageSystem(String name) {
//		this(name, 1001); // Calls the two-parameter constructor
		this.sName = name;
		System.out.println("Student Record Created for " + name);
	}

	// Two-Parameter Constructor
	public StudentManageSystem(String name, int id) {
		this.sName = name;
		this.sID = id;
		System.out.println("Student " + name + " with id " + id + " has been added");
	}

	public static void main(String[] args) {
		// Create objects using different constructors
		StudentManageSystem s1 = new StudentManageSystem();
		StudentManageSystem s2 = new StudentManageSystem("Swathi");
		StudentManageSystem s3 = new StudentManageSystem("Swathi", 18);
	}
}
