import java.util.Scanner;
public class CountOne {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the integer num:");
        int num = a.nextInt();
        a.close();
        int count = 0;
        while(num>0){
            if((num & 1)==1){
                count++;
            }
            num = num >> 1;
        }
        System.out.println("The count of 1's in "+num+ " is "+count);
    }
}
