package day14.Practice

import java.util.Scanner;

Recursion;

public class firstIndex {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int ans = searchFirstIndex(arr,0,x);
        System.out.println(ans);
    }
    public static int searchFirstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int ele = arr[idx];
        if(ele == x){
            return idx;
        }
        int recEle = searchFirstIndex(arr, idx+1,x);
        return recEle;
    }
}