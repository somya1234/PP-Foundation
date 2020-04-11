import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = tiling(n);
        System.out.println(ans);
    }
    public static int tiling(int n){
        int[] dp = new int[n+1];
        if(n==2 || n==1 || n==0){
            return n;
        }
        // dp[0] = 0;
        // dp[1] = 1;
        // dp[2] = 2;
        if(dp[n]!=0){
            return dp[n];
        }
        int fibN1 = tiling(n-1);
        int fibN2 = tiling(n-2);
        int fib = fibN1+fibN2;
        dp[n] = fib;
        
        return dp[n];
        // int[] dp = new int[n+1];
        // dp[0] = 0;
        // dp[1] = 1;
        // dp[2] = 2;
        // for(int pos=3; pos<=n; pos++){
        //     dp[pos] = dp[pos-1]+dp[pos-2];
        // }
        // return dp[n];
        }
}