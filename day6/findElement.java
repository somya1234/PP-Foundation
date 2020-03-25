import java.io.*;
import java.util.*;

public class findElement {

    public static int findEle(int arr,int d){
        for (int i = 0; i < arr.length; i++) {
            if (d == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = scn.nextInt();
        }
        int d = scn.nextInt();
        int ans = findEle(arr,d);       
        
    }

}