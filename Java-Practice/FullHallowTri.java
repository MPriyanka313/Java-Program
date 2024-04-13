import java.util.Scanner;
public class FullHallowTri {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the integer A:");
        int A = a.nextInt();
        FullHallowTrix(A);
        a.close();
    }
    public static void FullHallowTrix(int A){
        int i;
        int j;
        for(i=1;i<=A;i++){
            for(int k = 1; k <= A - i; k++) {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                if(j==1||j==i||i==A){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
