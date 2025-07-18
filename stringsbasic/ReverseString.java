package stringsbasic;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        char[] ch = str.toCharArray();

        int left = 0, right = ch.length - 1;
        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed: " + new String(ch));
    }
}
