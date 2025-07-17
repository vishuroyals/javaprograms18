package methodoverloading;

public class FileDownloader {
	void downloadFile() {
		System.out.println("A system allows users to downloaded");
	}

	void downloadFile(String s) {
		System.out.println("Accept a URL And download the file");
	}

	void downloadFile(String a, String b) {
		System.out.println("Accepts a URL and and file name to Save the file");
	}

	void downloadFile(String b, String a, double d) {
		System.out.println("Download the file at a controlled speed");
	}

	public static void main(String[] args) {
		FileDownloader n = new FileDownloader();
		n.downloadFile();
		n.downloadFile("C:\\Users\\Dell\\OneDrive\\ドキュメント");
		n.downloadFile("C:\\Users\\Dell\\OneDrive\\ドキュメント", "C:\\Users\\Dell\\OneDrive\\ドキュメント\\Downloads");
		n.downloadFile("C:\\Users\\Dell\\OneDrive\\ドキュメント\\Downloads", "C:\\Program Files\\Java\\jdk-24", 200.25);

	}
}
