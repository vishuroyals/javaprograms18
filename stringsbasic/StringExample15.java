package stringsbasic;

public class StringExample15 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);       // true – same memory reference
        System.out.println(s1 == s3);       // false – different objects
        System.out.println(s1.equals(s3));  // true – same value
    }
}
