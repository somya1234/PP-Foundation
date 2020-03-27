import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int d = scn.nextInt();
        int left_row = 0;
        int right_row = n-1;
        int left_col = 0;
        int right_col = n-1;
        int left = arr[0][0];
        int right = arr[n-1][n-1];
        while(left<=right){
            int mid_row = (left_row+right_row)/2;
            int mid_col = (left_col+right_col)/2;
            if(arr[mid_row][mid_col] == d){
                System.out.println(mid_row);
                System.out.println(mid_col);
            } else {
                
            }
            
        }
    }

}