import java.math.BigInteger;
public class MultiplyStrings {
    public static String multiplyStrings(String num1, String num2) {
        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);
        BigInteger result = number1.multiply(number2);
        return result.toString();
    }
    public static void main(String[] args) {
        String num1 = "2";
        String num2 = "10";
        String product = multiplyStrings(num1, num2);
        System.out.println(product);
    }
}
