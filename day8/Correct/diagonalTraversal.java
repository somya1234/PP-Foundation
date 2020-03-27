import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        //gap is till 3
        //0,1,2,3 
        for(int gap=0; gap<n; gap++){
            for(int row=0,col=row+gap; row<n&&row+gap<n; row++,col++){
                System.out.println(arr[row][row+gap]);
            }
        }
        
    }

}