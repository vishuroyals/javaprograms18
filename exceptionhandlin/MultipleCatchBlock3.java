package exceptionhandlin;

public class MultipleCatchBlock3 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
			System.out.println(a[10]);
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
