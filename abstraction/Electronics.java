package abstraction;

public class Electronics extends BaseProduct {

	int warrantyPeriod;

	public Electronics(String name, String type, double price, int period) {
		super(name, price, type);
		this.warrantyPeriod = period;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void price() {
		System.out.println("Price:" + this.price);

	}

	public void displayProductDetails() {
		System.out.println("Product Name:" + this.name);
		System.out.println("Product Type:" + this.type);
		System.out.println("Price: $" + this.price);
		System.out.println("Warranty:" + this.warrantyPeriod);
	}

}
