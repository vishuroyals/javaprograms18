package methodoverloading;

public class Demo {
	void UnlockMobile() {
		System.out.println("Swipe up to Unlock your mobile....");
	}

	void UnlockMobile(String Pattern) {
		System.out.println("Draw the Pattern to Unlock your mobile");
	}

	void UnblockMobile(int Pin) {
		System.out.println("Enter your pin to Unlock your mobile");
	}

	void UnlkockMobile(boolean FingerPrint) {
		System.out.println("Match your fingerprint to unlock your mobile");
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.UnlockMobile();
		obj.UnlockMobile("1234");
		obj.UnblockMobile(3456);
		obj.UnlkockMobile(true);
	}
}
