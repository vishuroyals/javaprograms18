package inheritance;

public class Employee {
	String name;
	double Salary;

	public Employee(String name, double Salary) {
		System.out.println("Employee Class Constructor");
		this.name = name;
		this.Salary = Salary;
	}

	void displayEmployeeDetails() {
		System.out.println("Employee Name:" + this.name);
		System.out.println("Salary:" + this.Salary);
	}
	public static void main(String[] args) {
		Employee e=new Employee("Smith",123.4567890);
		e.displayEmployeeDetails();
	}
}
