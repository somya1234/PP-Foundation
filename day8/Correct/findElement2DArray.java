import java.io.*;
import java.util.*;

public class findElement2DArray {

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
        Boolean flag = true;
        int d = scn.nextInt();
        int i=0;
        int j = arr.length-1;
        while(!(i>=arr.length || j<0)){
            if(arr[i][j]==d){
                flag = false;
                System.out.println(i);
                System.out.println(j);
                break;
            } else if(arr[i][j]>d){
                j--;
            } else{
                i++;
            }
        }
        if(flag == true){
            System.out.println("Not Found");
        }
    }

}