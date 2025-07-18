package encapsulation;

public class Emp {
	public static void main(String[] args) {
		EmployeeSal e1 = new EmployeeSal();
		e1.setEmpid("101");
		e1.setEmpName("Scott");
		e1.setSalary(123.4567);
		System.out.println("Employee Id:" + e1.getEmpid());
		System.out.println("Employee Name:" + e1.getEmpName());
		System.out.println("Employee Salary:" + e1.getSalary());
		e1.increaseSalary(5);
		System.out.println("Incremented Salary % is:"+e1.getPercentage);
		System.out.println("Employee Salary:" + e1.getSalary());
	}
}
