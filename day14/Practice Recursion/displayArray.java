package day14.Practice

import java.util.Scanner;

Recursion;

public class displayArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        printArray(arr,0);
    }
    public static void printArray(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
        return;
    }
}