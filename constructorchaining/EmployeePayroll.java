package constructorchaining;

public class EmployeePayroll {
String EName;
int Empid;
String Department;
double Salary;
public EmployeePayroll() {
	System.out.println("New Employee Record Created");
}
public EmployeePayroll(String EName) {
	this.EName=EName;
	System.out.println();
}
}
