package abstraction;

public class Student extends Person {
	int tutionFee;

	public Student(String name, int id, int fee) {
		super(name, id);
		this.tutionFee = fee;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {

		System.out.println("Student Name:" + this.name);
		System.out.println("Student Id:" + this.id);
		System.out.println("Tution fee:" + this.tutionFee);
		System.out.println("->->->->->->->->->->->->->->-->->");

	}

}
