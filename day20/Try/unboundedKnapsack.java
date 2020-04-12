import java.util.Scanner;
//memoization
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] val = new int[n];
        for (int i = 0; i < val.length; i++) {
            val[i] = scn.nextInt();
        }
        int[] wt = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = scn.nextInt();
        }
        int cap = scn.nextInt();

        int[] dp = new int[cap+1];
        int ans = 0;
        for(int pos=0; pos<n; pos++){
            int weight = wt[pos];
            int value = val[pos];
            ans = knapsack( weight, value,dp, cap );
        }
        
        System.out.println(ans);
    }
    public static int knapsack( int weight, int value, int[] dp, int idx) {
      
        if(idx == 0){
            return 0;
        } else if(idx<weight){
            return dp[idx];
        }
        if(dp[idx]!=0){
            return dp[idx];
        }

        int result = knapsack(weight, value, dp, idx-1);
        dp[idx] = result;

        if(idx >= weight){
            int first = knapsack(weight, value, dp, idx-weight);
            return Math.max(dp[idx], first+value);
        }
        
        return dp[idx];
    }
}