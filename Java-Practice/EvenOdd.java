import java.util.Scanner;
public class EvenOdd{
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the integer number:");
        int number = a.nextInt();
        int evenDigit=0;
        int oddDigit=0;
        while(number>0){
            int digit = number%10;
            if(digit%2==0){
                evenDigit = evenDigit * 10 + digit;
            }
            else{
                oddDigit = oddDigit *10 + digit;
            }
            number/=10;
        }
        System.out.println("evenDigit :");
        while(evenDigit>0){
            int digit = evenDigit % 10;
            System.out.println(digit+"");
            evenDigit /= 10;
        }
        System.out.println();
        System.out.println("oddDigit :");
        while(oddDigit>0){
            int digit = oddDigit % 10;
            System.out.println(digit+"");
            oddDigit /= 10;
        }
        System.out.println();
        a.close();
    }
}
