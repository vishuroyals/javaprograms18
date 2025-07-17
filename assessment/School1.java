package assessment;

public class School1 {
	String Name;
	String Location;
	int NumberOfStudents;

	public static void main(String[] args) {
		School1 obj = new School1();
		obj.Name = "ABC";
		obj.Location = "ATP";
		obj.NumberOfStudents = 3000;
		System.out.println("School Deatils");
		System.out.println("School Name:" + obj.Name);
		System.out.println("Location of School:" + obj.Location);
		System.out.println("Number of Students:" + obj.NumberOfStudents);
	}
}
