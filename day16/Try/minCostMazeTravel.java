// package day16.Try;

//Tabular Form
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                maze[i][j] = scn.nextInt();
            }
        }
        int ans = minCostFind(maze);
        System.out.println(ans);
    }
    public static int minCostFind(int[][] maze){
        int n = maze.length;
        int m = maze[0].length;
        int[][] dp = new int[n][m];

        for(int row = n-1; row>=0; row--){
            for(int col=m-1; col>=0; col--){
                //col = m and row = n;
                if(row==n-1 && col==m-1){
                    //important to differentiate between 'n' and 'm'.
                    //error here previously. // you write 1 here, which is wrong.
                    dp[row][col] = maze[row][col];
                } else if(row==n-1){
                    //adding all the below elements
                    //going from bottom(destination) to top
                    dp[row][col] = maze[row][col] + dp[row][col+1];
                } else if(col == m-1){
                    //going from right(destination) to left
                    dp[row][col] = maze[row][col] + dp[row+1][col];
                } else {
                    int h = dp[row][col+1];
                    int v = dp[row+1][col];
                    dp[row][col] = maze[row][col] + Math.min(h,v);
                }
            }
        }
        return dp[0][0];
    }
}