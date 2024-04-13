public class ReverseWordsOddPositions {
    public static String reverseWordsOddPositions(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                StringBuilder reversed = new StringBuilder(words[i]);
                result.append(reversed.reverse()).append(" ");
            } else {
                result.append(words[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String input = "Priyanka is a good girl";
        String output = reverseWordsOddPositions(input);
        System.out.println(output);
    }
}
