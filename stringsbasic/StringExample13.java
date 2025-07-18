package stringsbasic;

public class StringExample13 {
    public static void main(String[] args) {
        String original = "Swathi";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
