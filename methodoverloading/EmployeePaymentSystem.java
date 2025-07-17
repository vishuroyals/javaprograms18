package methodoverloading;

public class EmployeePaymentSystem {
	void calculateSalary() {
		System.out.println("Calculating Salaries");
	}

	void calculateSalary(double d, int i) {
		System.out.println("How many hours will employee Worked");
	}

	void calculateSalary(double d) {
		System.out.println("Full time Salaried Employees");
	}

	void calculateSalary(int i, double l) {
		System.out.println("Duration of Contract Employees");
	}

	public static void main(String[] args) {
		EmployeePaymentSystem m = new EmployeePaymentSystem();
		m.calculateSalary();
		m.calculateSalary(90.50, 80);
		m.calculateSalary(10.23650);
		m.calculateSalary(58, 10.20);
	}
}
