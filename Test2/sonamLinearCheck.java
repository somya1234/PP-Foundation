import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        boolean x=ishorizontal(arr) || isvertical(arr);
        if(x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static boolean ishorizontal(int arr[][]){
        for(int i=0;i<arr.length-1;i++){
           if(arr[i][0]!=arr[i+1][0]){
               return false;
           }
        }
        return true;
    }
    public static boolean isvertical(int arr[][]){
        for(int i=0;i<arr.length-1;i++){
           if(arr[i][1]!=arr[i+1][1]){
               return false;
           }
        }
        return true;
    }
}