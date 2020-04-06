package day16.Try;
import java.lang.*;
import java.util.Scanner;
public class minCostMazeRecursive {
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
        int ans = minCostFind(maze,0,0);
        System.out.println(ans);
    }
    public static int minCostFind(int[][] maze,int row, int col){
        int n = maze.length;
        int m = maze[0].length;
        // int[][] dp = new int[n][m];

        if(row==n || col==m){
            return 0;
        } else {
            int ele = maze[row][col];
            return ele;
        }

        int min = Integer.MAX_VALUE;
        int recCost = 0;
        recCost += minCostFind(maze, row, col+1);
        recCost += minCostFind(maze, row+1, col);
        min = Math.min(min, recCost);

        return recCost;
    }
}