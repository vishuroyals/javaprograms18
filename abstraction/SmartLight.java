package abstraction;

public class SmartLight extends BaseDevice {

	public SmartLight(int Id, String name, double powerConsumption) {
		super(Id, name, powerConsumption);
	}

	@Override
	public void deviceFunctionality() {
		System.out.println(name + " is adjusting brightness...");
	}
}
