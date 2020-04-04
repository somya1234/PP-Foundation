// package day14.Practice Recursion;
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
        //optional here.
        for(boolean[] row:visited){
            Arrays.fill(row,false);
        }
        floodfill(maze,0,0,"",visited);
        // write your code here
    }
    public static void floodfill(int[][] maze, int row, int col, String path, boolean[][] visited){
        if(row<0 || col<0 || row==maze.length || col==maze[0].length || visited[row][col]==true ||
        maze[row][col]==1 ){
            //important to check if maze[row][col] is 1 or not.
            return;
        }
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(path);
            //important to put return here.
            return;
        }
        visited[row][col] = true;
        floodfill(maze, row-1, col, path+"t", visited);
        floodfill(maze, row, col-1, path+"l", visited);
        floodfill(maze, row+1, col, path+"d", visited);
        floodfill(maze, row, col+1, path+"r", visited);
        //when the stack destroys, all the t and d and all strings stored also get displaced.
        //for example - you can take example of printStairPath where you take 
        //different calls for l1 ,l2 and l3.
        //after returning from a call, it's value gets lost.
        visited[row][col] = false;
        return;
    }
}