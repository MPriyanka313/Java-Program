import java.util.Scanner;
public class HallowTri {
   public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = a.nextInt();
        HallowTrix(num);
        a.close();
   }
   public static void HallowTrix(int num){
        int i;
        int j;
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++){
                if(j==1 || j==i ){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int k=1;k<=num;k++){
            System.out.print(k+" ");
        }
        System.out.println();
   }

}
