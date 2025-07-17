package intern;

class SmartDevice {
	private String deviceName;
	private boolean status;

	public SmartDevice(String deviceName) {
		this.deviceName = deviceName;
		this.status = false;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public boolean isOn() {
		return status;
	}

	public void turnOn() {
		status = true;
		System.out.println(deviceName + " is now ON.");
	}

	public void turnOff() {
		status = false;
		System.out.println(deviceName + " is now OFF.");
	}

	public void operateDevice() {
		System.out.println(deviceName + " is operating.");
	}
}

class SmartLight extends SmartDevice {
	private int brightness;

	public SmartLight(String deviceName) {
		super(deviceName);
		this.brightness = 50;
	}

	public void setBrightness(int brightness) {
		if (brightness < 0 || brightness > 100) {
			System.out.println("Invalid brightness level! Set between 0-100.");
		} else {
			this.brightness = brightness;
			System.out.println(getDeviceName() + " brightness set to " + brightness + "%.");
		}
	}

	@Override
	public void operateDevice() {
		if (isOn()) {
			System.out.println(getDeviceName() + " is lighting up with brightness at " + brightness + "%.");
		} else {
			System.out.println(getDeviceName() + " is OFF.");
		}
	}
}

class SmartFan extends SmartDevice {
	private int speed;

	public SmartFan(String deviceName) {
		super(deviceName);
		this.speed = 1;
	}

	public void setSpeed(int speed) {
		if (speed < 1 || speed > 5) {
			System.out.println("Invalid speed level! Set between 1-5.");
		} else {
			this.speed = speed;
			System.out.println(getDeviceName() + " speed set to level " + speed + ".");
		}
	}

	@Override
	public void operateDevice() {
		if (isOn()) {
			System.out.println(getDeviceName() + " is running at speed level " + speed + ".");
		} else {
			System.out.println(getDeviceName() + " is OFF.");
		}
	}
}

public class SmartHomeSystem {
	public static void main(String[] args) {
		SmartDevice light = new SmartLight("Living Room Light");
		SmartDevice fan = new SmartFan("Bedroom Fan");

		light.turnOn();
		((SmartLight) light).setBrightness(75);
		light.operateDevice();
		light.turnOff();
		light.operateDevice();
		System.out.println();
		System.out.println("***********************************");
		fan.turnOn();
		((SmartFan) fan).setSpeed(3);
		fan.operateDevice();
		fan.turnOff();
		fan.operateDevice();
	}
}