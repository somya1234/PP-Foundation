import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fib = findFib(n,new int[n+1]);
        System.out.println(fib);
    }
    public static int findFib(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int fibN1 = findFib(n-1, dp);
        int fibN2 = findFib(n-2, dp);
        int fib = fibN1 + fibN2;
        dp[n] = fib;
        return dp[n];
    }
}