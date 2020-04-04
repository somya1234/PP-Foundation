// package day14.Practice

import java.util.Scanner;

// Recursion;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] ans = allIndicesFn(arr,0,x,0);
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
        System.out.println();
    }
    public static int[] allIndicesFn(int[] arr, int idx, int x, int fsf){
        if(idx==arr.length){
            int[] base = new int[fsf];
            return base;
        }
        int[] result = null;
        if(arr[idx]==x){
            result = allIndicesFn(arr, idx+1, x, fsf+1);
            result[fsf] = idx;
        } else {
            result = allIndicesFn(arr, idx+1, x, fsf);
        }
        return result;
    }
}