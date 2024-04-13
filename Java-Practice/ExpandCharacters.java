import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExpandCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int count = c - '0'; 
                char lastChar = input.charAt(i - 1);
                for (int j = 0; j < count - 1; j++) {
                    charCount.put(lastChar, charCount.getOrDefault(lastChar, 0) + 1);
                }
            } else {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (charCount.containsKey(c)) {
                for (int i = 0; i < charCount.get(c); i++) {
                    output.append(c);
                }
                charCount.remove(c); 
            }
        }
        System.out.println("Expanded string: " + output.toString());
        scanner.close();
    }
}


