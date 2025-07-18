package methods;

public class NoParaNoRet {
	String name = "Virat";
	String color = "Black";
	int price = 100;

	void write() {
		System.out.println("The pen Writes");
	}

	void study() {
		System.out.println("The boy " + name + " is reading Everyday");
	}

	public static void main(String[] args) {
		NoParaNoRet obj = new NoParaNoRet();
		obj.write();
		obj.study();

		System.out.println("The Main Mehtod Excutes");
	}
}
