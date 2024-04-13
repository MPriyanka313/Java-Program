import java.util.Scanner;
public class HcfOfInteger {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the integer A: ");
        int A = a.nextInt();
        System.out.println("Enter the integer B: ");
        int B = a.nextInt();
        a.close();
        int digit = Math.min(A,B);
        int hcf = 1;
        int i;
        for(i=1;i<=digit;i++){
            if(A%i==0 && B%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF of " + A + " and " + B + " is " + hcf);
    }
}
