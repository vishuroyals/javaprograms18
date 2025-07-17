package day1;

public class Employee {
	String Empname = "Virat";
	int EmpNum = 18;
	String Designation = "King";
	double Salary = 2500.025;

	public static void main(String[] args) {
		Employee E1 = new Employee();
		System.out.println(E1.Empname);
		System.out.println(E1.EmpNum);
		System.out.println(E1.Designation);
		System.out.println(E1.Salary);
		Employee E2 = new Employee();
		System.out.println(E2.Empname);
		System.out.println(E2.EmpNum);
		System.out.println(E2.Designation);
		System.out.println(E2.Salary);

	}
}
