import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze= new int[n][m]; 
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                maze[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(maze,0,0,"",visited);
        // write your code here
    }

    public static void floodfill(int[][] maze, int row, int col, String psf,boolean[][] visited){
        int n = maze.length;
        int m = maze[0].length;
        if(row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 || visited[row][col]==true){
            //invalid movement
            return;
        }
        if(row==n-1 && col==m-1){
            //destination reached.
            System.out.println(psf);
            //important to return it here.
            return;
        }
        visited[row][col] = true; //block is occupied
        
        //top
        floodfill(maze,row-1,col,psf+"t",visited);
        //left
        floodfill(maze,row,col-1,psf+"l",visited);
        //down
        floodfill(maze,row+1,col,psf+"d",visited);
        //right
        floodfill(maze,row,col+1,psf+"r",visited);
        //at the end it gets false.
        visited[row][col] = false; //block is now unoccupied.

    }
}