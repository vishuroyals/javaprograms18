package inheritance;

public class FullTimeEmployee extends Employee {
	double bonus;

	public FullTimeEmployee(String name, double Salary, double bonus) {
		super(name, Salary);
		// TODO Auto-generated constructor stub
		System.out.println("Full Time Employee class Constructor ");
		this.name = name;
		this.Salary = Salary;
		this.bonus = bonus;
	}

	void calculate() {
		double totalsal = Salary + bonus;
		System.out.println("Calculating the  Total Salary");
	}

	void displayAll() {
		System.out.println("Employee Name:" + this.name);
		System.out.println("Salary:" + this.Salary);
		System.out.println("total SaLary:" + this.bonus);
	}

	public static void main(String[] args) {
		FullTimeEmployee f = new FullTimeEmployee("Smith", 123.4567890, 9000);
		f.displayAll();

	}

}
