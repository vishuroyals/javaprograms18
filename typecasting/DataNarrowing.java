package typecasting;

public class DataNarrowing {
	public static void main(String[] args) {
		int i = 99;
		double d = 100.25;
		System.out.println("int i:" + i);
		System.out.println("double d:" + d);
		System.out.println("After TypeCasting....");
		i = (int) d;
		d = (double) i;
		System.out.println("int i:" + i);
		System.out.println("double d:" + d);
	}
}
