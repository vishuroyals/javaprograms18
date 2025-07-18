package constructorchaining;

public class Demo {
	public Demo() {
		this("Hi");
		System.out.println("Hey.......! I'm a Zero arg Constructor");
	}

	public Demo(String name) {
		this(10, 10);
		System.out.println("Hey.......! I'm a One arg Constructor");
	}

	public Demo(int num, int n) {
		System.out.println("Hey.......! I'm a Two arg Constructor");
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
	}
}
