package garbagecollection;

public class Demo {
	@Override
	protected void finalize() {
		System.out.println("Objected Deleted........!");
	}

	public static void main(String[] args) {
		Demo objref1 = new Demo();
		Demo objref2 = new Demo();
		Demo objref3 = new Demo();
		objref1 = null;
		objref2 = null;
		objref3 = null;
		System.gc();
	}
}
