import java.util.Scanner;

// Example:-
// 0    0   1   0
// 0    1   0   0   
// 0    0   0   0
// 1    0   1   0

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int row = 0;
        int col = 0;
        int dir = 0;
        //0--> east direction --> row same, col changes
        //1-->south direction --> row changes, col same
        //2-->west direction -> row same, col changes
        //4-->north direction
        while(true){
            //modulus by 4.
            dir = (dir+mat[row][col])%4;
            if(dir == 0){
                //east direction
                //traverse in east direction
                col++;
            } else if(dir == 1){
                //south direction
                row++;
            } else if(dir == 2){
                //west direction
                col--;
            } else if(dir == 3){
                //north direction
                row--;
            }
            //Either you can handle the exit points inside the while loop
            //or outside it, it's the same thing. 
            //Then you can put while(col>=0 && col<m && row<n && row>=0)
            //Handling all the exit point cases
            if(row == n){
                //if exit point is from row = n (south side)
                //south exit point
                row--;
                break;
        //Note:- use else if to find the exit point.
            } else if(col == m){
                //east exit point
                col--;
                break;
            } else if(row == -1){
                //if exit point is top from row.(north direction)
                //north direction
                row++;
                break;
            } else if(col == -1){
                //west direction
                col--;
                break;
        //Note:-important to break once you have done exit.
            }
        }
        //there will always be an exit point.
        //There is no such case which does not have an exit point.
        System.out.println(row);
        System.out.println(col);
    }
}

