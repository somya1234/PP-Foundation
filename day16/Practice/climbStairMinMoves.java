package day16.Try;

import java.util.Scanner;

public class climbStairMinMoves {
    //Recursive Approach
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int ans = minMoves(arr, 0);
        System.out.println(ans);
    }
    public static int minMoves(int[] arr, int idx){
        int n =  arr.length;
        if(idx == n-1){
            return 0;
        }
        if(arr[idx]==0){
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        int maxStep = arr[idx];
        int recAns = 0;
        for(int step=1; step<=maxStep && idx+step<=n-1; step++){
            recAns = minMoves(arr, idx+step);
            min = Math.min(min, recAns);
        }
        return min+1;
    }
}