import java.util.*;
import java.io.*;
//Recursive Approach :- 
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maze[i][j] = scn.nextInt();
            }
        }
        int cost = maxGold(maze);
        System.out.println(cost);
    }
    public static int maxGold(int[][]maze){
        int[][] dp = new int[maze.length][maze[0].length];
         int max = Integer.MIN_VALUE;
         for(int i=0;i<maze.length;i++)
        {
            int val= maxCost(maze,i,0,dp);
            if(val>max)
            {
                max=val;
            }
        }
        return max;
    }
    public static int maxCost(int[][] maze, int row, int col, int[][] dp) {
        int n = maze.length;
        int m = maze[0].length;

        if (row < 0 || row == n) {
             return Integer.MIN_VALUE;
        }
      
        if (col == m - 1) {
            return maze[row][col];
        }
        if (dp[row][col] != 0) {
            return dp[row][col];
        }
        int d1=Integer.MIN_VALUE;
        int d2=Integer.MIN_VALUE;
        int d3=Integer.MIN_VALUE;
        d1 = maxCost(maze, row - 1, col + 1, dp);
        d2 = maxCost(maze, row, col + 1, dp);
        d3 = maxCost(maze, row + 1, col + 1, dp);
        int max = Math.max(d1, Math.max(d2, d3)) + maze[row][col];
        dp[row][col] = max;
        return max;
    }
}