package stringsbasic;

public class StringExample21 {
    public static void main(String[] args) {
        // StringBuilder (faster, not thread-safe)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Developer");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (slower, thread-safe)
        StringBuffer sf = new StringBuffer("Java");
        sf.append(" Developer");
        System.out.println("StringBuffer: " + sf);
    }
}
