package arrays;

public class Employee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		Employee e6 = new Employee();
		Employee e7 = new Employee();
		Employee e8 = new Employee();
		Employee e9 = new Employee();
		Employee e10 = new Employee();
		Employee emp_arr[] = { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10 };

		for (int i = 0; i < emp_arr.length; i++) {
			System.out.println(emp_arr[i]);
		}
	}
}
