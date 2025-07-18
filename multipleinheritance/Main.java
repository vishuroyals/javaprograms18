package multipleinheritance;

public class Main implements Switch, RemoteControl {

	@Override
	public void rotate() {
		System.out.println("Switch is on, Fan is Rotating...");
	}

	@Override
	public void rotate1() {
		System.out.println("Switch is on by RemoteControl , Fan is Rotating");
	}

}
