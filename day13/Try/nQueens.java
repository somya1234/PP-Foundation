import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     printNQueens(int[n][n],"",0);
    }
    public static boolean isSafe(int[][] chess, int row, int col){
        //queen can be placed at row, col or not.
        if(arr[row-1][col+1]==0 || arr[row][col+1]==0|| arr[row+1][col+1]==0
        || arr[row+1][col]==0 || arr[row+1][col-1]==0 || arr[row][col-1]==0)
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf);
            return;
        }
        int col = 0;
        boolean ans = isSafe(chess,row,col);
        if(ans == true){
        printNQueens(chess,qsf+,row+1);
        }
    }
}