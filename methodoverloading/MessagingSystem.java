package methodoverloading;

public class MessagingSystem {
	void sendMessage() {
		System.out.println("Sending Messages in different formats");
	}

	void sendMessage(String a) {
		System.out.println("Sends a  Simple Text Message");
	}

	void sendMessage(String s, byte g) {
		System.out.println("Send a Message with an Attachment");
	}

	void sendMessage(String b, byte u, String s) {
		System.out.println("Sends a Encrypted Message");
	}

	public static void main(String[] args) {
		MessagingSystem m = new MessagingSystem();
		m.sendMessage();
		m.sendMessage("Hello World");
		m.sendMessage("Good Morning", (byte) 156);
		m.sendMessage("Swathi", (byte) 102, "Bye");
	}
}
