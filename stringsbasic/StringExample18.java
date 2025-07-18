package stringsbasic;

public class StringExample18 {
    public static void main(String[] args) {
        String name = "Swathi";
        char[] chars = name.toCharArray();

        for(char c : chars) {
            System.out.print(c + " ");
        }
    }
}
