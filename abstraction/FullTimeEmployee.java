package abstraction;

public class FullTimeEmployee extends BaseEmployee {
	public void displayEmployeeDetails() {
		System.out.println("Employee Details:");
		System.out.println("-------------------");
		System.out.println();

		System.out.println("Name:" + this.getEmp_name());
		System.out.println();

		System.out.println("Id:" + this.getEmp_id());
		System.out.println();

		System.out.println("Employee Type: " + this.getEmp_type());
		System.out.println();

		System.out.println("Salary: $ " + this.getsalary());
		System.out.println();

	}

	@Override
	public void getSalary() {
		System.out.println("Salary:" + this.getsalary());

	}

}
