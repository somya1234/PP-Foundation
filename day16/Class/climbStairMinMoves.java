import java.io.*;
import java.util.*;

//Memoization

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = minMoves(0,arr,new int[n]);
        System.out.println(ans);
    }
    public static int minMoves(int n,int[]arr, int[] dp){
        //when we start as n = 0. 
        if(n==arr.length-1){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        if(arr[n]==0){
            //for eg --> arr[2]= 0, it will never lead to destination
            return Integer.MAX_VALUE;
        }
        int maxSteps = arr[n];
        int min = Integer.MAX_VALUE;
        for(int step=1; step<=maxSteps && n+step<=arr.length-1; step++){
            min=Math.min(min,minMoves(n+step, arr,dp));

        }
        // return min+1;
        dp[n] = min+1;
        return dp[n];
    }

}