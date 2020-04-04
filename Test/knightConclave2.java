package Test;

import java.util.Scanner;

import sun.security.util.Length;

public class knightConclave2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int k = scn.nextInt();
        printKknights(new int[row][col],-1, 0, k);
    }
    public static boolean isSafe(int[][] chess, int row, int col){
        for(int i=row-1, j=col+2; i>=0 && j<chess[0].length; i--,j++){
            if(chess[i][j]==1)
            return false;
        }
        //2
        for(int i=row+1, j=col+2; i<chess.length && j<chess[0].length; i++,j++){
            if(chess[i][j]==1)
            return false;
        }
        for(int i=row+2, j=col+1; i<chess.length && j<chess[0].length; i++,j++){
            if(chess[i][j]==1)
            return false;
        }
        for(int i=row+1, j=col-1; i<chess.length && j>=0; i++,j--){
            if(chess[i][j]==1)
            return false;
        }
        for(int i=row+1, j=col-2; i<chess.length && j>=0; i++,j--){
            if(chess[i][j]==1)
            return false;
        }

        for(int i=row-1, j=col-2; i>=0 && j>=0; i--,j--){
            if(chess[i][j]==1)
            return false;
        }
        for(int i=row-2, j=col-1; i>=0 && j>=0; i--,j--){
            if(chess[i][j]==1)
            return false;
        }
        for(int i=row-2, j=col+1; i>=0 && j<chess[0].length; i--,j++){
            if(chess[i][j]==1)
            return false;
        }
        return true;
    }
    public static void printKknights(int[][] chess, int idx, int count, int k){
        if(count == k){
            displayBoard(chess);
            return;
        }
       for(int i=idx+1; i<chess.length*chess[0].length; i++){
           int row = i/chess.length;
           int col = i%chess[0].length;
           if(isSafe(chess, row, col)==true){
               chess[row][col] = 1;
               printKknights(chess, idx, count+1, k);
               chess[row][col] = 0;
           }
       }
    }
    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}