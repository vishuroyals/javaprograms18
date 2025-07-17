package assessment;

public class ModifyingAgeVariable {
	int age = 25;

	public static void main(String[] args) {
		ModifyingAgeVariable m = new ModifyingAgeVariable();
		System.out.println("Age is:" + m.age);
		m.age = 18;
		System.out.println("After Modifying The age variable is:" + m.age);
	}

}
