import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int ans = pairing(n, k);
        System.out.println(ans);

    }
    public static int pairing(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];

        for (int idx = 0; idx <= n; idx++) {
            for (int col = 0; col <= k; col++) {
                if (idx == 0 || col == 0) {
                    dp[idx][col] = 0;
                } else if (idx < col) {
                    dp[idx][col] = 0;
                } else if (idx == col - 1) {
                    dp[idx][col] = 1;
                } else {
                    int a = dp[idx - 1, col - 1];
                    int b = (col * (dp[idx - 1][col]))
                    dp[idx][col] =  a+b ;
                }
            }


        }
        return dp[n][k - 1];
    }

}