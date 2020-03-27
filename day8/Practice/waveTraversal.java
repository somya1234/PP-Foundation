import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        //Method 1:-

        // for (int col = 0; col < m; col++) {
        //     if (col % 2 == 0) {
        //         int row = 0;
        //         while (row < n) {
        //             System.out.println(mat[row][col]);
        //             row++;
        //         }
        //     } else {
        //         int row = mat.length - 1;
        //         while (row >= 0) {
        //             System.out.println(mat[row][col]);
        //             row--;
        //         }
        //     }
        // }
            
        for(int col=0; col<m; col++){
            if(col%2==0){
                for(int row = 0; row<n; row++){
                    System.out.println(mat[row][col]);
                }
            } else {
                for(int row=n-1;row>=0; row--){
                    System.out.println(mat[row][col]);
                }
            }
        }
    }
}