package abstraction;

public class SmartHome {
	public static void main(String[] args) {
		SmartLight l1 = new SmartLight(101, "Living Room Light", 10.5);
		SmartThermostat t1 = new SmartThermostat(202, "Bedroom Thermostat", 25.0);

		l1.displayDeviceDetails();
		l1.deviceFunctionality();
		System.out.println("--------------------------------");

		t1.displayDeviceDetails();
		t1.deviceFunctionality();
		System.out.println("--------------------------------");
	}
}
