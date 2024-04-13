import java.util.Scanner;
public class Divisible {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the integer num: ");
        int num = a.nextInt();
        a.close();
        if(num%8==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
