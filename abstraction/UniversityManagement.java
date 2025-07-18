package abstraction;

public class UniversityManagement {
	public static void main(String[] args) {
		Professor p1 = new Professor("Scott", 201, 30000.0);
		Professor p2 = new Professor("Smith", 202, 40000.0);
		Student s1 = new Student("Ram", 101, 15000);
		Student s2 = new Student("Santer", 102, 12000);
		p1.getDetails();
		p2.getDetails();
		s1.getDetails();
		s2.getDetails();
	}
}
