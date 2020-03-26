import java.io.*;
import java.util.*;

public class ceilFloor {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==d){
                floor =arr[i];
                ceil = arr[i];
            } else if(arr[i]<=d){
                floor = arr[i];
                temp = i;
            }
        }
        System.out.println(arr[temp+1]);
        System.out.println(floor);
    }

}