package assessment;

public class ModifyingPrice {
	float price = 100.50f;

	public static void main(String[] args) {
		ModifyingPrice obj = new ModifyingPrice();
		System.out.println("Price is:" + String.format("%.2f", obj.price));
		obj.price = 150.75f;
		System.out.println("After Modifying The Price is:" + obj.price);
	}
}
