package inheritance;

public class Electronics extends Product {
	int warrantyPeriod;

	public Electronics(String ProductName, double Price, int warrantyPeriod) {
		super(ProductName, Price);
		this.warrantyPeriod = warrantyPeriod;
		// TODO Auto-generated constructor stub
		System.out.println("Electronic Class Constructor");
	}

	void displayAll() {
		System.out.println("Product Name:" + this.ProductName);
		System.out.println("Price:" + this.Price);
		System.out.println("Warranty Period in Months:" + this.warrantyPeriod);
	}

	public static void main(String[] args) {
		Electronics e = new Electronics("ABC", 123.86, 7);
		e.displayAll();
	}

}
