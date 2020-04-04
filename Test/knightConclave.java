package Test;

import java.util.Scanner;

public class knightConclave {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int k = scn.nextInt();
        printKknights(new int[row][col], 0,0, 0, k);
    }
    public static boolean isSafe(int[][] chess, int row, int col){
        for(int i=row-1, j=col+2; i>=0 && j<chess[0].length; i--,j++){
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
    public static void printKknights(int[][] chess, int row, int col, int count, int k){
        if(count == k){
            displayBoard(chess);
        }
        if(row==chess.length || col==chess[0].length){
            return;
        }
        if(isSafe(chess, row, col)){
            chess[row][col] = 1; //block the elements
            printKknights(chess, row, col+1, count+1, k);
            printKknights(chess, row+1, col, count+1, k);
            chess[row][col] = 0; //unblock the elements
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