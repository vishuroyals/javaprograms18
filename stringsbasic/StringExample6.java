package stringsbasic;

public class StringExample6 {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        String sub = message.substring(11);
        String sub2 = message.substring(0, 7);
        System.out.println("Substring from index 11: " + sub);
        System.out.println("Substring from 0 to 7: " + sub2);
    }
}
