import java.util.Scanner;
public class PrintInteger{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer A :");
        int A = s.nextInt();
        System.out.println("Enter the integer N :");
        int N = s.nextInt();
        s.close();
        for(int i=0; i<N ;i++){
            System.out.println(A);
        }
    }
}
