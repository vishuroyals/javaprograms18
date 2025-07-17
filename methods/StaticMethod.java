package methods;

public class StaticMethod {
	static int age;
	static String Name;

	static void disp() {
		System.out.println("Age is:" + age);
		System.out.println("Name is:" + Name);
	}

	public static void main(String[] args) {
		age = 36;
		Name = "VIRAT KOHLI";
		disp();
	}
}
