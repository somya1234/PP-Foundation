import java.util.Scanner;

public class fibonacciDp{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //length 1 geater than n so that all values from 0 gets store in this.
        fibonacci(n, new int[n+1]);
    }
    public static int fibonacci(int n, int dp[]){
        if(n==0 || n==1){
            return n;
        }
        //when the array has stored value ans is non-zero
        if(dp[n]!=0){
            return dp[n];
        }
        int fnM1 = fibonacci(n-1,dp);
        int fnM2 = fibonacci(n-2,dp);
        int fib = fnM1 + fnM2;
        dp[n] = fib;
        //try it with dry run of fib(5)
    
        return dp[n];
    }
}

