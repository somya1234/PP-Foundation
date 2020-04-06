
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = climbStairPaths(0,arr,new int[n]);
        System.out.println(ans);
    }
    public static int climbStairPaths(int idx, int[] arr, int[] dp){
        if(idx == arr.length-1){
            return 1;
        }
        int ele = arr[idx];
        int recPath = 0;
        if(dp[idx]!=0){
            return dp[idx];
        }
        for(int step=1; step<=ele; step++){
            if(step+idx<arr.length){
                recPath += climbStairPaths(idx+step, arr, dp);
            }
        }
        dp[idx] = recPath;
        //dp[0] will give the total no of paths
        //we can check it by making tree.
        return dp[idx];
    }
}