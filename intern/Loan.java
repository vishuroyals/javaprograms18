package intern;

public class Loan {
    private double loanAmount;
    protected double interestRate; 
    // Different rates for different loans

    public Loan(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanAmount() { 
    	// Encapsulation: Secure access to loan amount
        return loanAmount;
    }

    public double calculateEMI(int months) { 
        double monthlyRate = interestRate / 100 / 12;
        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) / 
               (Math.pow(1 + monthlyRate, months) - 1);
    }
}
