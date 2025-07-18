package abstraction;

public class Ac implements OperatableDevice{

	@Override
	public void turnON() {
		System.out.println("Turn On the Switch by Remote control.....!");
		System.out.println("You will get the air...!");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn Off the Switch by Remote control.....!");
		System.out.println("You will not get the air...!");
		
	}

}
