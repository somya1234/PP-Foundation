import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = maxSubsequence(arr,n);
        System.out.println(ans);
    }
    public static int maxSubsequence(int[] arr, int n){
        int[][] dp = new int[2][n+1];
        dp[0][1] = 0;
        for(int len=1;len<=n; len++){
            if(len<n){
            if(len%2!=0 ){
                dp[1][len] = arr[len-1]+ dp[1][len-1];
                dp[1][len+1]= dp[1][len-1];
            } else {
                dp[0][len] = arr[len-1]+ dp[0][len-1];
                dp[0][len+1]= dp[0][len-1];
            }
            } else {
                 if(len%2!=0 ){
                dp[1][len] = arr[len-1]+ dp[1][len-1];
                // dp[1][len+1]= dp[1][len-1];
            } else {
                dp[0][len] = arr[len-1]+ dp[0][len-1];
                // dp[0][len+1]= dp[0][len-1];
            }
            }
        }
        return Math.max(dp[0][n],dp[1][n]);
    }
}