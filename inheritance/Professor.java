package inheritance;

public class Professor extends Teacher {
	String Department;

	public Professor(String name, String subject, String Department) {
		super(name, subject);
		this.Department = Department;
		// TODO Auto-generated constructor stub
		System.out.println("Professor class Constructor");
	}

	void display() {
		System.out.println("Teacher Name: " + this.name);
		System.out.println("Subject:" + this.subject);
		System.out.println("Department:" + this.Department);
	}

	public static void main(String[] args) {
		Professor p = new Professor("Navya sri", "Java Full Stack", "CSE");
		p.display();
	}

}
