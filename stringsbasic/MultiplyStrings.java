package stringsbasic;

public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123", num2 = "45";
        System.out.println("Product: " + multiply(num1, num2));
    }

    public static String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];

        for(int i = num1.length() - 1; i >= 0; i--) {
            for(int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int num : result) {
            if(!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
