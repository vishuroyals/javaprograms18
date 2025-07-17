package internship;

public class Student extends Teacher {
	void getRole() {
		System.out.println("Learning");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.getRole();
		Teacher obj1 = new Teacher();
		obj1.getRole();
	}
}
