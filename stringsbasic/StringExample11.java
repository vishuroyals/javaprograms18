package stringsbasic;

public class StringExample11 {
    public static void main(String[] args) {
        String data = "Java,Python,C++,C";

        String[] languages = data.split(",");
        System.out.println("Languages:");
        for(String lang : languages) {
            System.out.println(lang);
        }
    }
}
