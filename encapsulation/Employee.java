package encapsulation;

public class Employee {
private String Ename;
private int Empid;
private int Salary;
private String job;
private String Dept;
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}

}
