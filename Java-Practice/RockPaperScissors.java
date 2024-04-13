import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.next();
        String player2 = scanner.next();
        if (player1.equals("R") && player2.equals("P") ||
            player1.equals("P") && player2.equals("S") ||
            player1.equals("S") && player2.equals("R")) {
            System.out.println(player2);
        } else if (player1.equals(player2)) {
            System.out.println("D");
        } else {
            System.out.println(player1);
        }
        scanner.close();
    }
}

