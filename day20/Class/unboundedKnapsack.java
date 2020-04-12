package day20.Class;

import java.util.Scanner;

public class unboundedKnapsack {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] val = new int[n];
        for(int i=0; i<val.length; i++){
            val[i] = scn.nextInt();
        }
        int[] wt = new int[n];
        for(int i=0; i<n; i++){
            wt[i] =scn.nextInt();
        }
        int cap = scn.nextInt();
        int ans = knapsack(wt,val,cap);
        System.out.println(ans);
    }
    public static int knapsack(int[] wt, int[] val, int cap){
        int n = wt.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int idx = 1; idx<=n; idx++){
            int weight = wt[idx-1];
            int value = val[idx-1];
            dp[idx] = Math.max(dp[idx],dp[idx-weight]+value);
        }
        return dp[n];
    }
}