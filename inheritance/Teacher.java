package inheritance;

public class Teacher {
	String name;
	String subject;

	public Teacher(String name, String subject) {
		System.out.println("Teacher Class Constructor");
		this.name = name;
		this.subject = subject;
	}

	void displayTeacherDetails() {
		System.out.println("Teacher Name: " + this.name);
		System.out.println("Subject:" + this.subject);
	}

	public static void main(String[] args) {
		Teacher t = new Teacher("Suguna", "Maths");
		t.displayTeacherDetails();
	}
}
