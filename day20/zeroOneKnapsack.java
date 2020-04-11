// package day20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] val = new int[n];
        for(int i=0; i<n; i++){
            val[i] = scn.nextInt();
        }
        int[] wt = new int[n];
        for(int i=0; i<n; i++){
            wt[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        System.out.println(maxValue(val,wt,cap));
    }
    public static int maxValue(int[] val, int[] wt, int cap){
        int n = val.length;
        int[][] dp = new int[n+1][cap+1];
       
        for(int i=0; i<=n; i++){
            for(int j=0; j<=cap; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                } else if(j>=wt[i-1]){
                    int weight = wt[i-1];
                    int value = val[i-1];
                    int result = Math.max(dp[i-1][j],dp[i-1][j-weight]+value);
                    dp[i][j] = result;
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        return dp[n][cap];
        
    }
}