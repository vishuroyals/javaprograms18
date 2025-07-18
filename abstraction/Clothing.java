package abstraction;

public class Clothing extends BaseProduct {
	private static String type;
	String size;
	String material;
	private String warrantyPeriod;

	public Clothing(String name, String type, double price, String size, String material) {
		super(name, price, type);
		this.size = size;
		this.material = material;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void price() {
		System.out.println("Price:" + this.price);

	}

	public void displayProductDetails() {
		System.out.println("Product Name:" + this.name);
		System.out.println("Price:" + this.price);
		System.out.println("Product Type:" + this.type);
		System.out.println("Warranty:" + this.warrantyPeriod);
		System.out.println("Size:" + this.size);
		System.out.println("Material:" + this.material);

	}
}