package assessment;

public class StringVariable {
	String s = "Newyork";

	public static void main(String[] args) {
		StringVariable obj = new StringVariable();
		System.out.println(obj.s);
		obj.s = "Los Angeles";
		System.out.println(obj.s);
	}
}
