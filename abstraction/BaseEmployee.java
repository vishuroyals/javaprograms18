package abstraction;

public abstract class BaseEmployee implements Employee {
	private String emp_name;
	private int emp_id;
	private String emp_type;
	private double salary;

	private void emp_type(String type) {
		// TODO Auto-generated method stub

	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_type() {
		return emp_type;
	}

	public void setEmp_type(String type) {
		this.emp_type = type;
	}

	public double getsalary() {
		return salary;
	}

	public void setsalary(double d) {
		this.salary = d;
	}

}
