package collectionframework;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student stu_Arr[] = { s1, s2, s3, s4, s5 };
		for (int i = 0; i < stu_Arr.length; i++) {
			System.out.println(stu_Arr[i]);
		}
		System.out.println("----------------------------------------------");
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		Employee Emp_arr[] = { e1, e2, e3, e4, e5 };
		for (int i = 0; i < Emp_arr.length; i++) {
			System.out.println(Emp_arr[i]);
		}
		System.out.println("-----------------------------------------");
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		User u5 = new User();
		User User_arr[] = { u1, u2, u3, u4, u5 };
		for (int i = 0; i < User_arr.length; i++) {
			System.out.println(User_arr[i]);
		}
		System.out.println("--------------------------------------------");
		Object Main_arr[] = { s1, s2, s3, s4, s5, e1, e2, e3, e4, e5, u1, u2, u3, u4, u5 };
		for (int i = 0; i < Main_arr.length; i++) {
			System.out.println(Main_arr[i]);
		}

	}
}
