package methodoverloading;

public class Employee1 {
	String Empname;
	String Designation;
	int EmpNum;
	int Salary;

	public Employee1() {
		System.out.println("I'm a Constructor of Employee Class with zero parameters");
	}

	public Employee1(String s) {
		System.out.println("I'm a Constructor of Employee Class with one parameter");

	}

	public Employee1(String Empname, int EmpNum) {
		System.out.println("I'm a Constructor of Employee Class with two parameters");
	}

	public static void main(String[] args) {
		Employee1 n = new Employee1();
		Employee1 n1 = new Employee1("Scott");
		Employee1 n2 = new Employee1("Smith", 1001);

	}
}
