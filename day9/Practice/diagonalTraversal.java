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
        for(int gap = 0; gap<n; gap++){
            for(int row = 0, col=gap; row<n&&col<n; row++,col++){
                System.out.println(mat[row][col]);
            }
        }
    }
}