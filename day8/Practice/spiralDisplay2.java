import java.io.*;
import java.util.*;

public class spiralDisplay2{

    //Using the count method of each elements.
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
        int count = 0;
        while(count<n*m){
        //Left Wall
        for(int st = row_min; st<=row_max && count<n*m; st++){
            System.out.println(arr[st][col_min]);
            count++;
        }
        col_min++;
        //Bottom Wall
        for(int i=col_min; i<=col_max && count<n*m; i++){
            System.out.println(arr[row_max][i]);
            count++;
        }
        row_max--;
        //Right Wall
        for(int i=row_max; i>=row_min && count<n*m;i--){
            System.out.println(arr[i][col_max]);
            count++;
        }
        col_max--;
        //Top Wall
        for(int i=col_max; i>=col_min && count<n*m;i--){
            System.out.println(arr[row_min][i]);
            count++;
        }
        row_min++;
    }
    }

}