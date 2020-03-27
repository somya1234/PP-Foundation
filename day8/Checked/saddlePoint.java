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
        Boolean newflag = true;
        for(int i=0; i<n; i++){
            int minEle = arr[i][0];
            int minIndex = 0;
            for(int j=0; j<n; j++){
                if(arr[i][j]<minEle){
                    minEle = arr[i][j];
                    minIndex = j;
                }
            }
            Boolean flag = true;
            for(int k=0; k<n; k++){
                if(arr[k][minIndex]>minEle){
                    flag = false;
                }
            }
            if(flag == true){
                newflag = false;
                System.out.println(minEle);
                break;
            }
        }
            if(newflag){
                
        System.out.println("Invalid input");
        
            }
    }

}