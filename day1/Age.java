package day1;

public class Age {
	int Variable_age = 25;

	public static void main(String[] args) {
		Age A1 = new Age();
		System.out.println("Age:" + A1.Variable_age);
		A1.Variable_age = 18;
		System.out.println("After modifying a Variable :" + A1.Variable_age);

	}
}
