package methodoverloading;

public class Addition {
	void add(int a, int b) {
		System.out.println("Sum of 2 int values--->" + (a + b));
	}

	void add(double a, double b) {
		System.out.println("Sum of 2 double values--->" + (a + b));
	}

	void add(int a, double b) {
		System.out.println("Sum of 1 int and 1 double value--->" + (a + b));
	}

	void add(double a, int b) {
		System.out.println("Sum of 1 double and 1 int value--->" + (a + b));
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10, 20);
		a.add(10.50, 20.90);
		a.add(10, 10.10);
		a.add(10.0, 10);
	}
}
