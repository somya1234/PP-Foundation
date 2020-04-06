
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = climbStairPaths(arr);
        System.out.println(ans);
    }
    public static int climbStairPaths(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        //at 9 position --> solving easiest question
        //dest --> dest
        dp[n-1] = 1;
        //from 8 --> 0 traverse
        for(int idx = n-2; idx>=0; idx--){
            
            int maxStep = arr[idx];
            for(int step=1; step<=maxStep; step++){
                if(step+idx<=arr.length-1){
                    dp[idx] = dp[idx+step];
                }
            }
        }
        
        return dp[0];
    }
}