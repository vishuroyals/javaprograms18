package stringsbasic;
public class StringExample24 {
    public static void main(String[] args) {
        String str = "swathi";
        int[] freq = new int[256];

        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
}
