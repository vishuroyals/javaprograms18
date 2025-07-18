package stringsbasic;

public class StringExample20 {
    public static void main(String[] args) {
        String str = "Swathi";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if(Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
