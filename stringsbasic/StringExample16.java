package stringsbasic;

public class StringExample16 {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";

        System.out.println(a.compareTo(b)); // Negative because "a" comes before "b"
        System.out.println(b.compareTo(a)); // Positive
        System.out.println(a.compareTo("apple")); // 0
    }
}
