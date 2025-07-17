package exceptionhandlin;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Main Starts.......!");
		int a = 10;
		int b = 8;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		try {
			System.out.println(a / 2);
		} catch (Exception ae) {
			System.out.println("can n ot divide any number by zero.......!");
		}
		System.out.println("Main ends.......!");
	}
}
