package assessment;
public class UserDefineConstructor {
	String EmpName;
	int EmpNum;
	String Designation;
	int Salary;

//	public UserDefineConstructor(String Name, int Num, String Job, int Sal) {
//		System.out.println("************************************************");
//		EmpName = Name;
//		EmpNum = Num;
//		Designation = Job;
//		Salary = Sal;
//
//	}
	public UserDefineConstructor(String EmpName, int EmpNum, String Designation, int Salary) {
		System.out.println("************************************************");
		this.EmpName = EmpName;
		this.EmpNum = EmpNum;
		this.Designation = Designation;
		this.Salary = Salary;
	}

	void PrintDetails() {
		System.out.println("Employee Name is:" + this.EmpName);
		System.out.println("Employee NUmber is :" + this.EmpNum);
		System.out.println("Designation is:" + this.Designation);
		System.out.println("Salary is:" + this.Salary);
	}

	public static void main(String[] args) {
		UserDefineConstructor obj = new UserDefineConstructor("Scott", 101, "Developer", 15000);
		obj.PrintDetails();
		UserDefineConstructor obj1 = new UserDefineConstructor("Smith", 102, "javDeveloper", 17000);
		obj1.PrintDetails();
		UserDefineConstructor obj2 = new UserDefineConstructor("Virat", 103, "Manager", 20000);
		obj2.PrintDetails();
		UserDefineConstructor obj3 = new UserDefineConstructor("Rohith", 104, "Analyst", 18000);
		obj3.PrintDetails();
		UserDefineConstructor obj4 = new UserDefineConstructor("Siraj", 105, "Tester", 19000);
		obj4.PrintDetails();
	}
}
