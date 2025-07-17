package exceptionhandlin;

public class Demo1 {
	String Greet = "Good Morning....";

	public static void main(String[] args) {
		System.out.println("Main Starts........!");
		Demo1 objref = null;
		System.out.println(objref);
		try {
			System.out.println(objref.Greet);
		} catch (NullPointerException ne) {
			System.out.println("Object Address is Pointing towards Null");
		}
		System.out.println("Main Ends..........!");
	}
}
