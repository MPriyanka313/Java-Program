public class CamelCaseCheck {
    public static String isCamelCase(String input) {
        if (input.matches("^[a-z][a-zA-Z0-9]*$")) {
            return "no";
        } else {
            return "yes";
        }
    }
    public static void main(String[] args) {
        String input = "WelcomeAll";
        String output = isCamelCase(input);
        System.out.println(output);
    }
}
