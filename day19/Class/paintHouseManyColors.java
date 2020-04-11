import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int n = arr[0];
        int k = arr[1];
        int[][] mat = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int ans = minCost(mat);
        System.out.println(ans);
    }
    public static int minCost(int[][] mat) {
        int n = mat.length;
        int k = mat[0].length;
        int[][] dp = new int[n][k];
        //solving easiest question
        for (int j = 0; j < k; j++) {
            dp[0][j] = mat[0][j];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (j == 0) {
                    int min = Integer.MAX_VALUE;
                    for (int loop = 1; loop < k; loop++) {
                        min = Math.min(dp[i-1][loop], min);
                    }
                    dp[i][j] = min + mat[i][j];
                } else if (j == k - 1) {
                    int min = Integer.MAX_VALUE;
                    for (int loop = 0; loop < k - 1; loop++) {
                        min = Math.min(dp[i-1][loop], min);
                    }
                    dp[i][j] = min + mat[i][j];
                } else {
                    int min = Integer.MAX_VALUE;
                    for (int loop = 0; loop < j; loop++) {
                        min = Math.min(dp[i-1][loop], min);
                    }
                    for (int loop = j + 1; loop < k; loop++) {
                        min = Math.min(dp[i-1][loop], min);
                    }
                    dp[i][j] = min + mat[i][j];
                }
            }
        }
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < k; j++) {
            result = Math.min(dp[n - 1][j], result);
        }
        return result;
    }
}