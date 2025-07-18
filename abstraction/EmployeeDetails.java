package abstraction;

public class EmployeeDetails {
	public static void main(String[] args) {
		FullTimeEmployee obj1 = new FullTimeEmployee();
		obj1.setEmp_name("Scott");
		obj1.setEmp_id(101);
		obj1.setEmp_type(" Full time ");
		obj1.setsalary(50000.4);
		obj1.displayEmployeeDetails();
		FullTimeEmployee obj2 = new FullTimeEmployee();
		obj2.setEmp_name("Smith");
		obj2.setEmp_id(102);
		obj2.setEmp_type(" Part time ");
		obj2.setsalary(2000.0);
		obj2.displayEmployeeDetails();
		PartTimeEmployee obj3 = new PartTimeEmployee();
		obj3.setEmp_name("Joe");
		obj3.setEmp_id(103);
		obj3.setEmp_type("full time ");
		obj3.setsalary(3000.0);
		obj3.displayEmployeeDetails();

	}
}
