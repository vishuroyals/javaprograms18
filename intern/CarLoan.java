package intern;

public class CarLoan extends Loan {
 public CarLoan(double loanAmount) {
     super(loanAmount);
     this.interestRate = 8.0;
 }

 @Override
 public double calculateEMI(int months) {
     System.out.println("Calculating EMI for Car Loan...");
     return super.calculateEMI(months);
 }
}
