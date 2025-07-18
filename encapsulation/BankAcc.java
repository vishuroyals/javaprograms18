package encapsulation;

public class BankAcc {
	String AccNum;
	private String AccHolderName;
	private double Balance;

	public String getAccNum() {
		return AccNum;
	}

	public void setAccNum(String accNum) {
		AccNum = accNum;
	}

	public String getAccHolderName() {
		return AccHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

}
