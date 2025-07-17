package day1;

public class UniversityCourse {
	String Course_Name;
	int duration;
	double fee;
	static String University_Name;

	public static void main(String[] args) {
		UniversityCourse U1 = new UniversityCourse();
		U1.Course_Name = "Java FullStack Developement";
		U1.duration = 190;
		U1.fee = 6900;
		UniversityCourse.University_Name = "Jntua";
		System.out.println("Course Name=" + U1.Course_Name);
		System.out.println("Duration=" + U1.duration);
		System.out.println("Fee=" + U1.fee);
		System.out.println("UniversityName=" + UniversityCourse.University_Name);

	}
}
