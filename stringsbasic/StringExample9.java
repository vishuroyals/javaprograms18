package stringsbasic;

public class StringExample9 {
    public static void main(String[] args) {
        String sentence = "I love Java programming";

        System.out.println("Index of 'Java': " + sentence.indexOf("Java"));
        System.out.println("Index of 'Python': " + sentence.indexOf("Python")); // returns -1
        System.out.println("Last index of 'a': " + sentence.lastIndexOf('a'));
    }
}
