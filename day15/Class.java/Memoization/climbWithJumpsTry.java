import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = climbPathsJumps(0,n,arr,new int[n+1]);
        System.out.println(ans);
    }
    public static int climbPathsJumps(int idx, int n,int[]arr, int[] db){
        if(idx == n-1){
            return 1;
        }
        int totalWays = 0;
        if(db[idx]!=0){
            return db[idx];
        }
        for(int step=1; step<arr[idx]; step++){
            if(idx+step<n){
                totalWays+=climbPathsJumps(idx+step,n,arr,db);
            }
        }
        //resource filling
        db[idx] = totalWays;
        return db[idx];
    }

}