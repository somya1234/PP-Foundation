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
        int d = scn.nextInt();
       int row = 0;
       int col = n-1;
       Boolean flag = true;
       //do not initialize for loops here.
        while(!(col<0 || row==n)){
            //it works under one while loop only and it is there until it gets some output.
                if(d==mat[row][col]){
                    flag = false;
                    System.out.println(row);
                    System.out.println(col);
                    break;
                } else if(mat[row][col]>d){
                    col--;
                } else {
                    row++;
                }
            }
            if(flag){
                System.out.println("Not Found");
            }
    }
}