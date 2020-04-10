import java.io.*;
import java.util.*;
//Tabulation

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int coins[] = new int[n];
        for(int idx = 0; idx<n; idx++){
            coins[idx] = scn.nextInt();
        }
        int tar = scn.nextInt();
        int ans = targetSum(coins,tar);
        System.out.println(ans);
    }
    public static int targetSum(int coins[], int tar){
        int dp[] = new int[tar+1];
        dp[0] = 1;
        
            for(int i=0; i<coins.length; i++){
                int coin = coins[i];
                //starting from the target of first coin 
                for(int j=coin; j<=tar; j++){
                    // if(j>=coin){
                    if(dp[j-coin]!=0){
                        //for this you can check with the sample example 
                        //uptil a target of 9.
                        dp[j]+=dp[j-coin];
                    // }
                    }
                }
            }
            int result = dp[tar];
            
    return result;
    }
}