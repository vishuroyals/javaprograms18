package abstraction;

public class Tv implements OperatableDevice {

	@Override
	public void turnON() {
		System.out.println("Turn on the TV........!");
		System.out.println("if you want to see Online classes");

	}

	@Override
	public void turnOff() {

		System.out.println("Turn off the TV............!");
		System.out.println("if you don't want to see Online classes");

	}

}
