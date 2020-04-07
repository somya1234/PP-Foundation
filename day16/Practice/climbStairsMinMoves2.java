// package day16.Try;

import java.util.Scanner;
import java.lang.*;
//Memoization

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = minMoves(arr, 0,new int[n]);
        System.out.println(ans);
    }
    public static int minMoves(int[] arr, int idx, int[] dp){
        int n =  arr.length;
        if(idx == n-1){
            return 0;
        }
        if(arr[idx]==0){
            return Integer.MAX_VALUE;
        }
        if(dp[idx]!=0){
            return dp[idx];
        }
        int min = Integer.MAX_VALUE;
        int maxStep = arr[idx];
        
        for(int step=1; step<=maxStep && idx+step<=n-1; step++){
            int recAns = minMoves(arr, idx+step, dp);
            min = Math.min(min, recAns);
        }
        dp[idx] = min+1;
        return dp[idx];
    }
}