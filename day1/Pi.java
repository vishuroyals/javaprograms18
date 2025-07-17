package day1;

public class Pi {
	final double Constant_Pi = 3.14159;

	public static void main(String[] args) {
		Pi P1 = new Pi();
		System.out.println("PI:" + P1.Constant_Pi);
		P1.Constant_Pi = 30;
		System.out.println("PI:" + P1.Constant_Pi);
	}
}
