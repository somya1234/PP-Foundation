import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = climbPathsJumps(0,arr,new int[n]);
        System.out.println(ans);
    }
    public static int climbPathsJumps(int n,int[]arr, int[] dp){
        //target is 10
        //when we start as 0. 
        if(n==arr.length-1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int maxClimb = arr[n];
        int totalWays = 0;
        for(int step=1; step<=maxClimb && n+step<=arr.length-1; step++){
            totalWays+=climbPathsJumps(n+step, arr,dp);
        }
        dp[n] = totalWays;
        return dp[n];
    }

}