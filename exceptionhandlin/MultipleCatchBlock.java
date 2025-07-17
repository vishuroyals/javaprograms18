package exceptionhandlin;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exeption Occurs......!");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Index out of Bound Exception occurs........!");
		} catch (Exception e) {
			System.out.println("Parent class Exception");
		}
		System.out.println("Rest of the code");
	}
}
