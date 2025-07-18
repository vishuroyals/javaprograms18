package abstraction;

public class Professor extends Person {
	double salary;

	public Professor(String name, int id, double sal) {
		super(name, id);
		this.salary = sal;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDetails() {
		System.out.println("Professor Name:" + this.name);
		System.out.println("Professor id:" + this.id);
		System.out.println("Salary:" + this.salary);
		System.out.println("->->->->->->->->->->->->->->-->->");

	}

}
