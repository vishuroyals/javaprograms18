package methods;

public class ParWithoutRet {
	String Name;

	void studying() {
		System.out.println("Student is studying ");
		System.out.println("No parameter & No return method is executed ");
	}

	void Method(String Name) {
		System.out.println(Name + " is printing");
		System.out.println("Parameter & no return Type");
	}

	public static void main(String[] args) {
		ParWithoutRet obj = new ParWithoutRet();
		obj.studying();
		obj.Name = "Virat";
		obj.Method("Virat");
	}
}
