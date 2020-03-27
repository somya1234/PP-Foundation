import java.util.Scanner;

//Example:-
//Input:-
//  11  12  13  14  15
//  21  22  23  24  25
//  31  32  33  34  35
// 
// Output:-
//  (All in next line, but for convenience.)
//  11  21  31  32  33  34  35  25  15  14  13  12  22  23  24
// (An anti-clockwise spiral)


public class spiralDisplay{
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
        int row_min = 0;
        int row_max = n-1;
        int col_min = 0;
        int col_max = m-1;
        while(row_min<=row_max && col_min<=col_max){
            //left wall
            for(int i=row_min; i<=row_max && (row_min<=row_max && col_min<=col_max); i++){
                System.out.println(mat[i][col_min]);
            }
            //increment the column checked so that double value doesn't come
            //and it never enters that row/column again(once it has traversed.)
            col_min++;
            //bottom wall
            //we need to check the condition (row_min<=row_max && col_min<=col_max)
            //in every for loop as the case may come where row_min<=row_max && col_min<=col_max
            //but after going 1 or 2 loop, this condition becomes false.
            //so as to avoid any extra values, it is necessary to write this condition in every for loop.
            for(int i=col_min; i<=col_max && row_min<=row_max && col_min<=col_max; i++){
                System.out.println(mat[row_max][i]);
            }
            row_max--;
            //right wall
            for(int i=row_max; i>=row_min && row_min<=row_max && col_min<=col_max; i--){
                System.out.println(mat[i][col_max]);
            }
            col_max--;
            //top wall
            for(int i=col_max; i>=col_min && row_min<=row_max && col_min<=col_max; i--){
                System.out.println(mat[row_min][i]);
            }
            row_min++;
        }
    }
}