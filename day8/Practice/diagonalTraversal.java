import java.util.Scanner;


public class diagonalTraversal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        //method -1 --> don't use this 
        for(int gap = 0; gap<n; gap++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((j-i)==gap){
                        System.out.println(mat[i][j]);
                    }
                }
            }
        }

        //method 2-
        //gap is till 3
        //0,1,2,3 
        // time complexity - n2.
        for(int gap=0; gap<n; gap++){
            
            // both row and col gets incremented together.
            for(int row=0,col=gap; row<n&&col<n; row++,col++){
                System.out.println(mat[row][col]);
            }
        }

        //method 3-
    }
}