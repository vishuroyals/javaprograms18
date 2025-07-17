package methodoverloading;

public class MediaPlayer {
	void playMedia() {
		System.out.println("A Media Player plays different types of media files");
	}

	void playMedia(String s) {
		System.out.println("Plays an Audio File");
	}

	void playMedia(String s, String h) {
		System.out.println("To play a video file");
	}

	void playMedia(String s, String h, String g) {
		System.out.println("Play a Video with subtitles");
	}

	public static void main(String[] args) {
		MediaPlayer n = new MediaPlayer();
		n.playMedia();
		n.playMedia("HeartBreakAnniversay");
		n.playMedia("Three", "Nee Pata Madhuram");
		n.playMedia("SanamteriKasam", "TeraChehra", "VideoHD");
	}
}
