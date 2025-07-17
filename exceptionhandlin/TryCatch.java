package exceptionhandlin;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int dats = 50 / 0; // may throw Exception
			// if exception occurs, the remaining statement will not executed
			System.out.println("Rest of the code");
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
