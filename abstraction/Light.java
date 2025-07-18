package abstraction;

public class Light implements OperatableDevice {

	@Override
	public void turnON() {
		System.out.println("Turn On the Switch .....!");
		System.out.println("You will get the way to go destination ...!");

	}

	@Override
	public void turnOff() {
		System.out.println("Turn On the Switch .....!");
		System.out.println("You will not get the way to go destination...!");

	}

}
