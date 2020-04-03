import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubsets(arr,0,"",0,tar);
        System.out.println();
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx == arr.length || sos>tar){
            return;
        }
        if(sos==tar){
            System.out.println(set+".");
            return;
        }
        String new_set = "";
        new_set = set+arr[idx]+", ";
        printTargetSumSubsets(arr,idx+1,new_set,sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }

}