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
        int ans = climbPathsJumps(0,arr);
        System.out.println(ans);
    }
    public static int climbPathsJumps(int n,int[]arr){
        //target is 10
        //when we start as 0. 
        if(n==arr.length){
            return 0;
        }
        int maxClimb = arr[n];
        int totalWays = 0;
        for(int step=1; step<=maxClimb && step<=arr.length; step++){
            totalWays+=climbPathsJumps(n+step, arr);
        }
        return totalWays;
    }

}