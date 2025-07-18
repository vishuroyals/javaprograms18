package stringsbasic;

public class AllStringMethods {
    public static void main(String[] args) {
        String original = "  Java Programming  ";
        String second = "java programming";

        // 1. length()
        System.out.println("Length: " + original.length());

        // 2. trim()
        String trimmed = original.trim();
        System.out.println("Trimmed: [" + trimmed + "]");

        // 3. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 4. charAt()
        System.out.println("Character at index 2: " + trimmed.charAt(2));

        // 5. substring()
        System.out.println("Substring from index 5: " + trimmed.substring(5));
        System.out.println("Substring from 0 to 4: " + trimmed.substring(0, 4));

        // 6. equals() and equalsIgnoreCase()
        System.out.println("Equals: " + trimmed.equals(second));
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(second));

        // 7. compareTo() and compareToIgnoreCase()
        System.out.println("Compare To: " + trimmed.compareTo(second));
        System.out.println("Compare To Ignore Case: " + trimmed.compareToIgnoreCase(second));

        // 8. indexOf() and lastIndexOf()
        System.out.println("Index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // 9. startsWith() and endsWith()
        System.out.println("Starts with 'Java': " + trimmed.startsWith("Java"));
        System.out.println("Ends with 'ing': " + trimmed.endsWith("ing"));

        // 10. contains()
        System.out.println("Contains 'Pro': " + trimmed.contains("Pro"));

        // 11. replace() and replaceAll()
        System.out.println("Replace 'a' with '@': " + trimmed.replace('a', '@'));
        System.out.println("ReplaceAll 'a' with '*': " + trimmed.replaceAll("a", "*"));

        // 12. isEmpty() and isBlank()
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is Empty: " + emptyStr.isEmpty());
        System.out.println("Is Blank: " + blankStr.isBlank());

        // 13. split()
        String[] words = trimmed.split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 14. toCharArray()
        char[] chars = trimmed.toCharArray();
        System.out.print("Characters: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 15. format()
        String formatted = String.format("Welcome %s! You scored %d marks.", "Swathi", 95);
        System.out.println("Formatted String: " + formatted);

        // 16. join()
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Joined String: " + joined);

        // 17. matches()
        System.out.println("Is valid word (only letters): " + trimmed.matches("[a-zA-Z ]+"));
    }
}
