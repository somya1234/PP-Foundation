// package day16.Try;
import java.lang.*;
import java.io.*;
import java.util.*;
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
        int ans = minCostFind(maze, 0, 0);
        System.out.println(ans);
    }
    public static int minCostFind(int[][] maze, int row, int col) {
        int n = maze.length;
        int m = maze[0].length;
        // int[][] dp = new int[n][m];

        int recCost = 0;
        int min_val = Integer.MAX_VALUE;
        if (row == n || col == m) {
            return 0;
        }
        // if(row==n-1 && col==m-1){
        //     return maze[row][col];
        // }
        
        recCost += minCostFind(maze, row, col + 1);
        recCost += minCostFind(maze, row + 1, col);
        if (row != n && col != n) {
            int ele = maze[row][col];
            return ele;
        }
        min_val += Math.min(min_val, recCost);

        return min_val;
    }
}