package stringsbasic;

public class StringExample17 {
    public static void main(String[] args) {
        String text = "abc123xyz";

        boolean result = text.matches("[a-z]+[0-9]+[a-z]+");
        System.out.println("Pattern matched: " + result);
    }
}
