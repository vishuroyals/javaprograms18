package encapsulation;

public class EmployeeSal {
private String Empid;
private String EmpName;
private double Salary;
public String getPercentage;
void increaseSalary(int i) {
	
	double percentage=+Salary;
	if(percentage<=0) {
		System.out.println("Error");
	}
	else {
		
	}
}

public String getEmpid() {
	return Empid;
}
public void setEmpid(String empid) {
	Empid = empid;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
}
