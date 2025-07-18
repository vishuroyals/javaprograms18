package stringsbasic;

public class StringExample10 {
    public static void main(String[] args) {
        String original = "Java is awesome";

        String replaced = original.replace("awesome", "powerful");
        String replacedChar = original.replace('a', '@');

        System.out.println("After replace: " + replaced);
        System.out.println("After character replace: " + replacedChar);
    }
}
