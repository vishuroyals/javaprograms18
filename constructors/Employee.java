package constructors;

public class Employee {
	String EmpName;
	int EmpNum;
	String Designation;
	int salary;

	public Employee() {
		System.out.println("Employee Objected Created.........!");
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
	}
}
