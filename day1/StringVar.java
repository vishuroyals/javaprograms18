package day1;

public class StringVar {
	String Variable_City = "NewYork";

	public static void main(String[] args) {
		StringVar S1 = new StringVar();
		System.out.println("Before Modification : " + S1.Variable_City);
		S1.Variable_City = "Los Angeles";
		System.out.println("After Modification : " + S1.Variable_City);
	}
}
