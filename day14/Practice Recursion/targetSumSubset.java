package day14.Practice

import java.util.Scanner;

Recursion;

public class targetSumSubset {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTragetSumSubsets(arr,0,"",0,tar);
    }
    public static void printTragetSumSubsets(int[] arr, int idx, String subset, int count, int target){
        if(arr.length==idx){
            if(count == target){
                //print only when target is achieved.
                System.out.println(subset);
                return;
            }
        }

        if(arr[idx]+count<=target){
            printTragetSumSubsets(arr, idx+1, subset+arr[idx]+", ", count, target);
        }
        printTragetSumSubsets(arr, idx+1, subset, count, target);

    }
}