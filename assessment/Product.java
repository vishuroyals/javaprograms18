package assessment;

public class Product {
	int ProductId;
	String ProductName;
	int price;

	public static void main(String[] args) {
		Product obj = new Product();
		obj.ProductId = 101;
		obj.ProductName = "Laptop";
		obj.price = 50000;
		System.out.println("Product Details");
		System.out.println("ProductId:" + obj.ProductId);
		System.out.println("Product Name:" + obj.ProductName);
		System.out.println("Price:" + obj.price);
	}
}
