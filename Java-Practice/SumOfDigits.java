import java.util.Scanner;
public class SumOfDigits{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the integer num : ");
        int num = a.nextInt();
        a.close();
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum = sum+digit;
            num /= 10;
        }
        System.out.println(sum);
    }
}