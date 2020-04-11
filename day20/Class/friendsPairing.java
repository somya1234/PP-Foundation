import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = pairing(n);
        System.out.println(ans);
        
    }
    public static int pairing(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int idx=3; idx<=n; idx++){
            dp[idx] = dp[idx-1]+((idx-1)*dp[idx-2]);
            
        }
        return dp[n];
    }

}