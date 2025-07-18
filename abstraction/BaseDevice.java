package abstraction;

public abstract class BaseDevice implements SmartDevice {
	int deviceId;
	String name;
	double powerConsumption;

	public BaseDevice(int Id, String name, double powerConsumption) {
		this.deviceId = Id;
		this.name = name;
		this.powerConsumption = powerConsumption;
	}

	public void displayDeviceDetails() {
		System.out.println("Device ID: " + deviceId);
		System.out.println("Device Name: " + name);
		System.out.println("Power Consumption: " + powerConsumption + "Watts");
	}
}
