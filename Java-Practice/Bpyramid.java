import java.util.Scanner;
public class Bpyramid{
    public static void main(String args[]){
        int i, space, k = 0;
        Scanner s=new Scanner(System.in);
        int rows=s.nextInt();
        s.close();
        for (i = 1; i <= rows; ++i,k = 0) {
            for (space = 1; space <= rows - i; ++space) {
                System.out.print("b");
                
            }
            while (k !=  2 * i - 1) {
                System.out.print("*");
                ++k;
                
            }
            for (space = 1; space <= rows - i; ++space) {
                System.out.print("b");
                
            }
            System.out.print("\n");
            
        }
    }
}
