package intern;

public class  ECommercePlatform {
public static void main(String[] args) {
	RegularCustomer obj=new RegularCustomer("101", "Scott", "scott@gmail.com");
	PremiumCustomer obj1=new PremiumCustomer("102", "Smith", "smith18@gmail.com");
	double regularPrice = 9000.0; 
	double premiumPrice = 6000.0;
	System.out.println("Regular Customer Discounted Price: $" + obj.calculateDiscount(regularPrice));
    System.out.println("Premium Customer Discounted Price: $" + obj1.calculateDiscount(premiumPrice));}
}
