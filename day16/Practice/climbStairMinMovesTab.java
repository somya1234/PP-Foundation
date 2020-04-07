import java.util.Scanner;

//Tabulation Method
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = minMoves(arr);
        System.out.println(ans);
    }
    public static int minMoves(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[n - 1] = 0;

        for (int i = n - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            int maxStep = arr[i];
            if (arr[i] == 0) {
                dp[i] = Integer.MAX_VALUE;
            } else {
                for (int step = 1; step <= maxStep && i + step < n; step++) {
                    //for i=7, step = 1 and 2.
                    //i+step = 8 and 9 respectively
                    min = Math.min(min, dp[i + step]);
                }

                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
}