package day1;

public class Teacher {
	int Teacher_id;
	String Teacher_Name;
	String Subject;

	public static void main(String[] args) {
		Teacher T1 = new Teacher();
		T1.Teacher_id = 101;
		T1.Teacher_Name = "xxx";
		T1.Subject = "Mathematics";
		System.out.println("TeacherId:" + T1.Teacher_id);
		System.out.println("TeacherName:" + T1.Teacher_Name);
		System.out.println("Subject:" + T1.Subject);
		System.out.println("----------------------------");
		Teacher T2 = new Teacher();
		T2.Teacher_id = 102;
		T2.Teacher_Name = "yyy";
		T2.Subject = "Science";
		System.out.println("TeacherId:" + T2.Teacher_id);
		System.out.println("TeacherName:" + T2.Teacher_Name);
		System.out.println("Subject:" + T2.Subject);
		System.out.println("----------------------------");
		Teacher T3 = new Teacher();
		T3.Teacher_id = 103;
		T3.Teacher_Name = "zzz";
		T3.Subject = "Social";
		System.out.println("TeacherId:" + T3.Teacher_id);
		System.out.println("TeacherName:" + T3.Teacher_Name);
		System.out.println("Subject:" + T3.Subject);
		System.out.println("----------------------------");
		Teacher T4 = new Teacher();
		T4.Teacher_id = 104;
		T4.Teacher_Name = "aaa";
		T4.Subject = "Telugu";
		System.out.println("TeacherId:" + T4.Teacher_id);
		System.out.println("TeacherName:" + T4.Teacher_Name);
		System.out.println("Subject:" + T4.Subject);
		System.out.println("----------------------------");
		Teacher T5 = new Teacher();
		T5.Teacher_id = 105;
		T5.Teacher_Name = "bbb";
		T5.Subject = "English";
		System.out.println("TeacherId:" + T5.Teacher_id);
		System.out.println("TeacherName:" + T5.Teacher_Name);
		System.out.println("Subject:" + T5.Subject);
	}
}
