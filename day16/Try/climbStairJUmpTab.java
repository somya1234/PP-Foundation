
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int val = arr.length-1;
        int ans = climbStairPaths(val,arr);
        System.out.println(ans);
    }
    public static int climbStairPaths(int n, int[] arr){
        int[] dp = new int[n+1];
        // if(n==arr.length-1){
        //     return 1;
        // }
        dp[n] = 1;
        for(int idx = n; idx>=0; idx--){
        int recAns = 0;
            
            int maxStep = arr[idx];
            for(int step=1; step<=maxStep; step++){
                if(step+idx<=arr.length-1){
                    recAns += climbStairPaths(n+step,arr);
                }
            }
            dp[n] = recAns;
        }
        
        return dp[0];
    }
}