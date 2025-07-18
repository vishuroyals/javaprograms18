package stringsbasic;

import java.util.regex.*;

public class StringExample22 {
    public static void main(String[] args) {
        String input = "Contact: swathi@gmail.com";

        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-z]+\\.[a-z]{2,6}");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        } else {
            System.out.println("No email found.");
        }
    }
}
