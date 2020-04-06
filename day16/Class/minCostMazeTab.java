
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
        
        for(int row = n-1; row>=0; row--){
            for(int col = m-1; col>=0; col--){
                if(row==n-1 && col==m-1){
                    dp[row][col] = arr[row][col];
                } else if(row == n-1){
                    dp[row][col] = arr[row][col] + dp[row][col+1];
                } else if(col==m-1){
                    dp[row][col] = arr[row][col]+ dp[row+1][col];
                } else {
                    
                dp[row][col] = arr[row][col] + (Math.min(dp[row][col+1],dp[row+1][col]));
                }
                
            }
        }
            
            
        return dp[0][0];
    }
}