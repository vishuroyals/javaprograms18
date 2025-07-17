package exceptionhandlin;

public class MultipleCatchBlock4 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs........!");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index out Of bound Exception occurs.........!");
		} catch (Exception ee) {
			System.out.println("Parents Exception occurs......!");

		}
		System.out.println("Rest of the Code");

	}

}
