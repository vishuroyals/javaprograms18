package intern;

public class HomeLoan extends Loan {
    public HomeLoan(double loanAmount) {
        super(loanAmount);
        this.interestRate = 6.0; 
        // Fixed interest rate for home loans
    }

    @Override
    public double calculateEMI(int months) { 
    	// Overriding EMI calculation
        System.out.println("Calculating EMI for Home Loan...");
        return super.calculateEMI(months);
    }
}