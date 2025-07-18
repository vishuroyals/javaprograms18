package abstraction;

public abstract class BaseProduct implements Product {
	String name;
	int pid;
	double price;
	String type;

	public BaseProduct(String name, double price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;

	}

	public void displayProductDetails() {
		System.out.println("Product Name:" + this.name);
		System.out.println("Price:" + this.price);
		System.out.println("Product Type:" + this.type);
	}
}
