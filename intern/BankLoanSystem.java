package intern;

public class BankLoanSystem {
	public static void main(String[] args) {
		Loan homeLoan = new HomeLoan(900000); // ₹9,00,000 Home Loan
		Loan carLoan = new CarLoan(600000); // ₹6,00,000 Car Loan

		int months = 60; // 5-year loan

		// Demonstrating polymorphic behavior
		System.out.println("Home Loan EMI: ₹" + String.format("%.2f", homeLoan.calculateEMI(months)));
		System.out.println("Car Loan EMI: ₹" + String.format("%.2f", carLoan.calculateEMI(months)));
	}
}