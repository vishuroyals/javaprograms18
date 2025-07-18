package abstraction;

public class Fan1 implements OperatableDevice {

	@Override
	public void turnON() {
		System.out.println("Turn On the Switch.....!");
		System.out.println("You will get the air...!");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off the Switch.....!");
		System.out.println("You will not  get the air...!");
		
	}

}
