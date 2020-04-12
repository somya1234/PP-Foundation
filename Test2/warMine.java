package Test2;

import java.util.Scanner;

// 12
// 10
// 1  1  1  1  1  1  1  1  1  1
// 1  0  1  1  1  1  1  1  1  1
// 1  1  1  0  1  1  1  1  1  1
// 1  1  1  1  0  1  1  1  1  1
// 1  1  1  1  1  1  1  1  1  1
// 1  1  1  1  1  0  1  1  1  1
// 1  0  1  1  1  1  1  1  0  1
// 1  1  1  1  1  1  1  1  1  1
// 1  1  1  1  1  1  1  1  1  1
// 0  1  1  1  1  0  1  1  1  1
// 1  1  1  1  1  1  1  1  1  1
// 1  1  1  0  1  1  1  1  1  1

public class warMine {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int result = Integer.MAX_VALUE;
        for(int row=0; row<n; row++){
            int ans = printPaths(mat,row,0,0);
            result = Math.min(result,ans);
        }
        System.out.println(result);

    }
    public static int printPaths(int[][] mat, int row, int col,int step){
        int count=0;
        int n = mat.length;
        int m = mat[0].length;

        if(row<0 || col<=-1 || row==n || col==m || mat[row][col]==0 
        || mat[row][col+1]==0 || mat[row][col-1]==0 || mat[row+1][col]==0
        || mat[row-1][col]==0){
            return 0;
        }

        if(col==m-1){
            return step;
        }

        count+=printPaths(mat, row, col+1,step+1);
        count+=printPaths(mat, row+1, col,step+1);
        count+=printPaths(mat, row-1, col,step+1);
        count+=printPaths(mat, row, col-1,step+1);
        return step;
    }
}