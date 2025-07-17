package day1;

public class OnlineShoppingCart {
	String Product_Name;
	double Price;
	int Stock;
	static String Shopease;

	public static void main(String[] args) {
		OnlineShoppingCart obj1 = new OnlineShoppingCart();
		obj1.Product_Name = "Mobile";
		obj1.Price = 2345678;
		obj1.Stock = 234;
		OnlineShoppingCart.Shopease = "Amazon";
		System.out.println("Product Name=" + obj1.Product_Name);
		System.out.println("Price=" + obj1.Price);
		System.out.println("Stock=" + obj1.Stock);
		System.out.println("Shopease=" + OnlineShoppingCart.Shopease);
	}
}
