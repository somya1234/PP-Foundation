//Memoization 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[][] mat = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        int[][] dp = new int[n][k];

        int result = minCost(mat, n - 1, 0, dp);

        // print the minimum value calculated.
        System.out.println(result);
    }

    public static int minCost(int[][] mat, int row, int col, int[][] dp) {
        int k = mat[0].length;

        if (dp[row][col] != 0) {
            return dp[row][col];
        } else if (row == 0) {
            return mat[row][col];
        }

        for (int idx1 = 0; idx1 < k; idx1++) {
            int min = Integer.MAX_VALUE;
            for (int idx = 0; idx < k; idx++) {
                if (idx != idx1) {
                    int value = minCost(mat, row - 1, idx, dp);
                    min = Math.min(min, value);
                }
            }
            dp[row][col] = min + mat[row][col];
        }

        int minValue = Integer.MAX_VALUE;
        for(int idx=0; idx<k; idx++){
            minValue = Math.min(minValue, dp[n-1][idx]);
        }

        return minValue;
    }

}