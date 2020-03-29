import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = fib(n);
        System.out.println(f);
    }
    public static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }
        int fibN1 = fib(n-1);
        int fibN2 = fib(n-2);
        int fibN = fibN1 + fibN2;
        return fibN;
    }
}