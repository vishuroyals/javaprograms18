package abstraction;

public class Bike extends Vehicle {

	@Override
	void run() {
		System.out.println("Bike Running.....!");

	}

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.run();
	}

}
