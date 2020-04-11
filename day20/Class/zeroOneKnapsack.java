import java.io.*;
import java.util.*;

public class Main {

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
        int[][] dp= new int[n+1][cap+1];
        
        
        for(int row=0; row< dp.length; row++){
            for(int col=0; col<dp[0].length; col++){
                if(row==0 || col==0){
                    dp[row][col] = 0;
                } else {
                    int value = val[row-1];
                    int w = wt[row-1];
                    if(w<=col){
                        //this case is very important because
                        // otherwise for inc value it will go col<0 duw to
                        //w > col and index out of bounds.
                    int inc = dp[row-1][col-w] + value;
                    int exc = dp[row-1][col];
                    dp[row][col] = Math.max(inc,exc);
                    } else {
                        dp[row][col] = dp[row-1][col];
                    }
                }
            }
        }
        
        return dp[n][cap];
    }
}