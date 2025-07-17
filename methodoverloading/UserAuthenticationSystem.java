package methodoverloading;

public class UserAuthenticationSystem {
	void authenticateUser() {
		System.out.println("System Authenicates users");
	}

	void authenticateUser(String s, String a) {
		System.out.println("Accepts Username and Password");
	}

	void authenticateUser(String a, String h, int i) {
		System.out.println("Two Factor Authentication");
	}

	void authenticateUser(byte s) {
		System.out.println("Finger Authentication");
	}

	public static void main(String[] args) {
		UserAuthenticationSystem m = new UserAuthenticationSystem();
		m.authenticateUser();
		m.authenticateUser("RadhaKrishna", "swathuuu@18");
		m.authenticateUser("RadhaKrishna", "swathuu@18", 2005);
		m.authenticateUser((byte) 156);
	}
}
