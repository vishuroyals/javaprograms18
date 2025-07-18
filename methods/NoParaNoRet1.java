package methods;

public class NoParaNoRet1 {
	void studying() {
		System.out.println("Student is studying");
		System.out.println("No parameter & No return method is executed ");
	}

	public static void main(String[] args) {
		NoParaNoRet1 obj = new NoParaNoRet1();
		obj.studying();
		obj.studying();
		obj.studying();

	}
}
