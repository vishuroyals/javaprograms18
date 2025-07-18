package inheritance;

public class Patient extends Person {
	String disease;

	public Patient(String Name, int age, String disease) {
		super(Name, age);
		this.disease = disease;
		// TODO Auto-generated constructor stub
		System.out.println("Patient Class Constructor");
	}

	void display() {
		System.out.println("Name:" + this.Name);
		System.out.println("Age:" + this.age);
		System.out.println("Disease:" + this.disease);
	}

	public static void main(String[] args) {
		Patient p = new Patient("Smith", 29, "Viral Fever");
		p.display();
	}

}
