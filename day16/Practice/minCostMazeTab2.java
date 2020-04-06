
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<m; j++)
                arr[i][j] = scn.nextInt();
        }
        int ans = minCostMaze(arr);
        System.out.println(ans);
    }
    public static int minCostMaze(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        
        //dest --> dest
        dp[n-1][m-1] = arr[n-1][m-1];
        //from 8 --> 0 traverse
        for(int col=m-2; col>=0; col--){
            dp[n-1][col] = arr[n-1][col]+ dp[n-1][col+1];
        }
        for(int row=n-2; row>=0; row--){
            dp[row][m-1] = arr[row][m-1]+ dp[row+1][m-1];
        }
        for(int row = n-2; row>=0; row--){
            for(int col = m-2; col>=0; col--){
                dp[row][col] = arr[row][col] + (Math.min(dp[row][col+1],dp[row+1][col]));
            }
        }
            
            
        return dp[0][0];
    }
}