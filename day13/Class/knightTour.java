import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = scn.nextInt();
        int col = scn.nextInt();
        printKnightsTour(new int[n][n],row,col,1);
        System.out.println();
    }
    //upcomingMove --> the next move that knight is going to take place.
    public static void printKnightsTour(int[][] chess, int row, int col, int upcomingMove) {
        if(row<0 || col<0 || row>=chess.length || col>=chess.length ||
        chess[row][col] !=0){
            //chess[row][col]!=0 so that it does not visit one position again.
            //invalid place
            return;
        }
        //here, upcomingMove == 25
        if(upcomingMove== chess.length*chess[0].length){
            //here for 25, without writing it we're directly printing it.
            // so we have to set it specifically and then unplace also.
            chess[row][col] = upcomingMove; //extra work
            displayBoard(chess);
            chess[row][col] = 0; //extra work
            return;
        }
        //place your knight
        //work --> mark for the given position
        chess[row][col] = upcomingMove;
        //faith --> it will mark for rest of the position.
        printKnightsTour(chess,row-2,col+1,upcomingMove+1);
        printKnightsTour(chess,row-1,col+2,upcomingMove+1);
        printKnightsTour(chess,row+1,col+2,upcomingMove+1);
        printKnightsTour(chess,row+2,col+1,upcomingMove+1);
        printKnightsTour(chess,row+2,col-1,upcomingMove+1);
        printKnightsTour(chess,row+1,col-2,upcomingMove+1);
        printKnightsTour(chess,row-1,col-2,upcomingMove+1);
        printKnightsTour(chess,row-2,col-1,upcomingMove+1);
        chess[row][col]=0; //unplace
        // upcomingMove--;
        //this will decrease automatically at the time of stack destroy.
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