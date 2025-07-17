package intern;

public class RegularCustomer extends Customer {

	public RegularCustomer(String cid, String nam, String mail) {
		super(cid, nam, mail);
	}
double calculateDiscount(double price) {
	return price-(price*0.05);
	
}
}
class PremiumCustomer extends Customer{

	public PremiumCustomer(String cid, String nam, String mail) {
		super(cid, nam, mail);
	}
	double calculateDiscount(double price) {
		return price-(price*0.10);

		
	}
	
}
