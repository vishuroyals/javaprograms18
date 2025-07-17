package methodoverloading;

public class DataBackupSystem {
	void backupData() {
		System.out.println("System backups files in different ways");
	}

	void backupData(String s) {
		System.out.println("Creates a local backup");
	}

	void backupData(String s, String t) {
		System.out.println("Store the backup in the cloud");
	}

	void backupData(String s, String j, String m) {
		System.out.println("Created an Encrypted cloud backup");
	}

	public static void main(String[] args) {
		DataBackupSystem b = new DataBackupSystem();
		b.backupData();
		b.backupData("C:\\Users\\Dell\\OneDrive\\Pictures\\kiran photos");
		b.backupData("C:\\Users\\Dell\\OneDrive\\Pictures\\New folder",
				"C:\\Users\\Dell\\OneDrive\\Pictures\\New folder\\IMP");
		b.backupData("C:\\Users\\Dell\\OneDrive\\Pictures\\New folder\\IMP", "C:\\Windows", "C:\\Windows\\assembly");
	}
}
