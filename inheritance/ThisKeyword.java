package inheritance;

public class ThisKeyword {
	void Write() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		System.out.println(obj);
		obj.Write();
	}
}
