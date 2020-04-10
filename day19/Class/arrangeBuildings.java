import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long ans = arrangeBuildings(n);
        System.out.println(ans);
    }
    public static long arrangeBuildings(int n) {
        long[][] dp = new long[2][n + 1];
        //answer easiest question
        dp[0][1] = 1;
        dp[1][1] = 1;
        for (int len = 2; len <= n; len++) {
            dp[0][len] = dp[0][len - 1] + dp[1][len - 1];
            dp[1][len] = dp[0][len - 1];
        }
        long total = dp[0][n] + dp[1][n];
        return total * total;
    }

}