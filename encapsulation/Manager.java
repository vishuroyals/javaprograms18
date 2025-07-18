package encapsulation;

public class Manager extends Employee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEname("Scoot");
		e1.setEmpid(101);
		e1.setSalary(1234);
		e1.setJob("Analyst");
		e1.setDept("Deveolpment");
		System.out.println("Employee Name:" + e1.getEname());
		System.out.println("Employee id:" + e1.getEmpid());
		System.out.println("Employee Salary:" + e1.getSalary());
		System.out.println("Employee Job:" + e1.getJob());
		System.out.println("Employee Department:" + e1.getDept());
		System.out.println("**************************************************");

		Employee e2 = new Employee();
		e2.setEname("Sam");
		e2.setEmpid(102);
		e2.setSalary(12347569);
		e2.setJob("engineer");
		e2.setDept("Deveolpment");
		System.out.println("Employee Name:" + e2.getEname());
		System.out.println("Employee id:" + e2.getEmpid());
		System.out.println("Employee Salary:" + e2.getSalary());
		System.out.println("Employee Job:" + e2.getJob());
		System.out.println("Employee Department:" + e2.getDept());
		System.out.println("**************************************************");

		Employee e3 = new Employee();
		e3.setEname("Sindh");
		e3.setEmpid(103);
		e3.setSalary(876543);
		e3.setJob("Tester");
		e3.setDept("Deveolpment");
		System.out.println("Employee Name:" + e3.getEname());
		System.out.println("Employee id:" + e3.getEmpid());
		System.out.println("Employee Salary:" + e3.getSalary());
		System.out.println("Employee Job:" + e3.getJob());
		System.out.println("Employee Department:" + e3.getDept());
		System.out.println("**************************************************");

		Employee e4 = new Employee();
		e4.setEname("Rama");
		e4.setEmpid(104);
		e4.setSalary(1234);
		e4.setJob("Machine learning Analyst");
		e4.setDept("Deveolpment");
		System.out.println("Employee Name:" + e4.getEname());
		System.out.println("Employee id:" + e4.getEmpid());
		System.out.println("Employee Salary:" + e4.getSalary());
		System.out.println("Employee Job:" + e4.getJob());
		System.out.println("Employee Department:" + e4.getDept());
		System.out.println("**************************************************");
		Employee e5 = new Employee();
		e5.setEname("Smith");
		e5.setEmpid(105);
		e5.setSalary(123456);
		e5.setJob("Data Analyst");
		e5.setDept("Deveolpment");
		System.out.println("Employee Name:" + e5.getEname());
		System.out.println("Employee id:" + e5.getEmpid());
		System.out.println("Employee Salary:" + e5.getSalary());
		System.out.println("Employee Job:" + e5.getJob());
		System.out.println("Employee Department:" + e5.getDept());

	}
}
