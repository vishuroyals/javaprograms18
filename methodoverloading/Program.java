package methodoverloading;

public class Program {
	void display(int i) {
		System.out.println(i);
	}

	void display(String s) {
		System.out.println(s);
	}

	void display(double d) {
		System.out.println(d);
	}

	void display(boolean b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Program obj = new Program();
		obj.display(10);
		obj.display("java");
		obj.display(10.50);
		obj.display(true);
	}
}
