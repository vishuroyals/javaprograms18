package inheritance;

public class GraduateStudent extends Student {
	String researchTopic;

	public GraduateStudent(String name, int rollnum, String researchTopic) {
		super(name, rollnum);
		System.out.println("Graduate Student class Constructor");

		this.researchTopic = researchTopic;
		// TODO Auto-generated constructor stub

	}

	void displayAll() {
		System.out.println("Name:" + this.name);
		System.out.println("RollNumber:" + this.rollnum);
		System.out.println("Research Topic:" + this.researchTopic);
	}

	public static void main(String[] args) {
		GraduateStudent g1 = new GraduateStudent("Swathi", 18, "ConstructorOverloading");
		g1.displayAll();
	}
}
