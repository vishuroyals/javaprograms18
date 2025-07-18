package abstraction;

public class SmartThermostat extends BaseDevice {

	public SmartThermostat(int Id, String name, double powerConsumption) {
		super(Id, name, powerConsumption);
	}

	@Override
	public void deviceFunctionality() {
		System.out.println(name + " is adjusting temperature...");
	}
}
