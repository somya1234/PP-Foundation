import java.util.Scanner;

public class palindrome{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int reverse = 0;
        while(n!=0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n/=10;
        }
        if(temp==reverse){
           System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}