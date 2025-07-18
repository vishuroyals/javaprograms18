package constructors;

public class Bike {
	String Name, Color;
	int price, tax;

	Bike(String n, String c, int p, int t) {
		this.Name = n;
		this.Color = c;
		this.price = p;
		this.tax = t;
	}

	void sellingPrice() {
		int price = this.price + this.tax;
		System.out.println(price);
	}

	void details() {
		System.out.println(this.Name);
		System.out.println(this.Color);
		this.sellingPrice();
	}

	public static void main(String[] args) {
		Bike b1 = new Bike("Duke", "Black", 251444, 33388888);
		b1.details();
	}
}
