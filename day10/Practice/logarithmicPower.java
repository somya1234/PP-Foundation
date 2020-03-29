import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = power(x,n);
        System.out.println(p);
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        //for any power of 1--> answer is always 1.
        if(x==1){
            return 1;
        }
        int p = power(x,n/2);
        int result = p*p;
        if(n%2!=0){
            result*=x;
        }
        return result;
    }
}