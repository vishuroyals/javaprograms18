package constructorchaining;

public class Employee {
	int eno;
	String Ename;

	Employee() {
		System.out.println("Employee registered..........");
	}

	Employee(int eno, String Ename) {
		this();
		this.eno = eno;
		this.Ename = Ename;
		System.out.println("Employee Initialized...........");
	}

	public static void main(String[] args) {
		Employee e = new Employee(1001, "Virat");
	}
}
