import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int row_min = 0;
        int row_max = arr.length-1;
        int col_min = 0;
        int col_max = arr[0].length-1;
        while(row_min<=row_max || col_min<=col_max){
        //Left Wall
        for(int st = row_min; st<=row_max; st++){
            System.out.println(arr[st][col_min]);
        }
            col_min = col_min+1;
        //Bottom Wall
        for(int i=col_min; i<=col_max; i++){
            System.out.println(arr[row_max][i]);
        }
            row_max= row_max-1;
        //Right Wall
        for(int i=row_max; i>=row_min;i--){
            System.out.println(arr[i][col_max]);
        }
            col_max= col_max-1;
        //Top Wall
        for(int i=col_max; i>col_min;i--){
            System.out.println(arr[row_min][i]);
        }
            row_min = row_min+1;
        
        }
    }

}