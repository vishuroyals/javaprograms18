package assessment;

public class MultipleConstants {
	final int MAX_AGE = 100;
	final int MIN_AGE = 1;
	final int DEFAULT_AGE = 18;

	public static void main(String[] args) {
		MultipleConstants obj = new MultipleConstants();
		System.out.println("MAX_AGE:" + obj.MAX_AGE);
		System.out.println("MIN_AGE:" + obj.MIN_AGE);
		System.out.println("DEFAULT_AGE:" + obj.DEFAULT_AGE);
	}

}
