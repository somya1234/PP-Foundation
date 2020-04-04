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
        int ans = searchLastIndex(arr,0,x);
        System.out.println(ans);
    }
    public static int searchLastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int recEle = searchLastIndex(arr, idx+1,x);
        int ele = arr[idx];
        if(recEle == -1){
            if(ele == x){
                recEle = idx;
                return recEle;
            }
        }
        
        return recEle;
    }
}