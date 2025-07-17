package exceptionhandlin;

public class NestedTryBlock {
	public static void main(String[] args) {
		// outer try block
		try {
			// inner try block 1;
			try {
				System.out.println("Going to divide by 0....!"); // going to divide by 0
				int b = 39 / 0;
			}
			// catch block of inner try block1
			catch (ArithmeticException e) {
				System.out.println(e); // java.lang.ArithmeticException: /by zero
			}
			// inner try block 2
			try {
				int a[] = new int[5];
				// assigning the value out of array bounds
				a[5] = 4;

			}
			// catch block of inner try block 2
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				// java.lang.ArrayIndexOutOfBoundsException:Index 5 out of bounds for length 5

			}
			System.out.println("Other Statement.....!");
		} catch (Exception e) {
			System.out.println("Handled the Exception (outer catch)");
		}
		System.out.println("Normal flow....");
	}
}
