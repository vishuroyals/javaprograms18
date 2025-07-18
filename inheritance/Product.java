package inheritance;
//int i=10;
public class Product {
	String ProductName;
	double Price;

	public Product(String ProductName, double Price) {
		System.out.println("Product Class Constructor");
		this.ProductName = ProductName;
		this.Price = Price;
	}

	void displayProductDetails() {
		System.out.println("Product Name:" + this.ProductName);
		System.out.println("Price:" + this.Price);
	}

	public static void main(String[] args) {
		Product p1 = new Product("ABC", 123.86);
		p1.displayProductDetails();
	}
}
