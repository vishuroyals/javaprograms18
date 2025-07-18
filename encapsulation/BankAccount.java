package encapsulation;

public class BankAccount {
private String AccountHolderName;
private int Account_Number;
private String Account_type;
private int Deposit;
private String IFSC_code;
public String getAccountHolderName() {
	return AccountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	AccountHolderName = accountHolderName;
}
public int getAccount_Number() {
	return Account_Number;
}
public void setAccount_Number(int account_Number) {
	Account_Number = account_Number;
}
public String getAccount_type() {
	return Account_type;
}
public void setAccount_type(String account_type) {
	Account_type = account_type;
}
public int getDeposit() {
	return Deposit;
}
public void setDeposit(int deposit) {
	Deposit = deposit;
}
public String getIFSC_code() {
	return IFSC_code;
}
public void setIFSC_code(String iFSC_code) {
	IFSC_code = iFSC_code;
}
}
