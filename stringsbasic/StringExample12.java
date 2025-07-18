package stringsbasic;

public class StringExample12 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Swathi");

		sb.append(" Golla");
		sb.insert(0, "Ms. ");
		sb.replace(4, 10, "Sreeja");
		sb.delete(0, 4);

		System.out.println("Final StringBuilder content: " + sb.toString());
	}
}
