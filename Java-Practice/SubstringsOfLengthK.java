import java.util.Scanner;
public class SubstringsOfLengthK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int k = scanner.nextInt();
        for (int i = 0; i <= input.length() - k; i++) {
            System.out.print(input.substring(i, i + k) + " ");
        }
        scanner.close();
    }
}
