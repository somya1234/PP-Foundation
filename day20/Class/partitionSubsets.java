import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        long ans = pairing(n, k);
        System.out.println(ans);

    }
    public static long pairing(int n, int k) {
        long[][] dp = new long[k + 1][n + 1];

        for (int i = 1; i <= k; i++) {
            for (int col = i; col <= n; col++) {
                if (i==1 || i==col || col==1){
                    //loop starting from i
                    dp[i][col] = 1;
                } else {
                    dp[i][col] = dp[i - 1][col - 1] + (i * (dp[i][col-1]));
                }
            }


        }
        return dp[k][n];
    }

}