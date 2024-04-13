import java.util.Scanner;

public class RightTri {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num = a.nextInt();
        RightTris(num);
        a.close();
    }

    public static void RightTris(int num) {
        int number = 1;
        int i;
        int j;
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(number + " ");  
                number++;
            }
            System.out.println(); 
        }
    }
}

