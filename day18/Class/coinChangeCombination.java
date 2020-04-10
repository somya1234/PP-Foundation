import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int coins[] = new int[n];
        for(int idx = 0; idx<n; idx++){
            coins[idx] = scn.nextInt();
        }
        int tar = scn.nextInt();
        boolean ans = targetSum(coins,tar);
        System.out.println(ans);
    }
    public static boolean targetSum(int coins[], int tar){
        boolean dp[][] = new boolean[coins.length+1][tar+1];
        //by default boolean array is false
        
        for(int row=0; row<coins.length+1; row++){
            for(int col=0; col<tar+1; col++){
                if(col==0){
                    dp[row][col] = true;
                } else if(row == 0){
                    dp[row][col] = false;
                } else {
                    int coin = coins[row-1];
                    //array starts from 0.
                    //and dp is having coins from 1.
                    
                    //including coin :- dp[row-1][tar-coin]
                    
                    //not including the coin : dp[row-1][tar]
                    boolean inc = false;
                    boolean exc = dp[row-1][col];
                    if(coin<=col){
                        //all left cases when col is less 
                        //that the coin number itself.
                        inc = dp[row-1][col-coin];
                    }
                    dp[row][col] = inc || exc;
                }
            }
            if(dp[row][tar] == true){
                //if i get answer before traversing all the rows
                //answer is target 10.
                
                return true;
            }
        }
    return dp[coins.length][tar];
    }
}