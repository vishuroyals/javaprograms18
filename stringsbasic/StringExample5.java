package stringsbasic;

public class StringExample5 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = "HELLO";

        System.out.println(a.equals(b));       // true
        System.out.println(a.equals(c));       // false
        System.out.println(a.equalsIgnoreCase(c)); // true
    }
}
