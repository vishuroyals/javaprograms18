package methods;

public class WithRetWithPar {
	int Multiplication(int x, int y) {
		int result;
		result = x * y;
		return result;
	}

	public static void main(String[] args) {
		WithRetWithPar obj = new WithRetWithPar();
		int result = obj.Multiplication(2, 9);
		System.out.println("Multiplication of two numbers is =" + result);
	}
}
