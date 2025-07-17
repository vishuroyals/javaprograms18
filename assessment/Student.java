package assessment;

public class Student {
	String Sname;
	int Sid;
	float Percentage;
	int backlogs;
	String Branch;

	public static void main(String[] args) {
		Student obj = new Student();
		obj.Sname = "Virat";
		obj.Sid = 18;
		obj.Percentage = 92.2f;
		obj.backlogs = 0;
		obj.Branch = "CSE";
		System.out.println("Student Details");
		System.out.println("Student Name:" + obj.Sname);
		System.out.println("Student Id:" + obj.Sid);
		System.out.println("Percentage:" + obj.Percentage);
		System.out.println("Backlogs:" + obj.backlogs);
		System.out.println("Branch:" + obj.Branch);

	}
}
