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
        if(idx == arr.length){
            //so as to include 0's otherwise it will break there only.
            //and if we loop it till end also, then due to tree it will always 
            //give a final answer on full traversal
            //because we have two choices, either include or not 
            if(sos==tar){
                //target reach 
                System.out.println(set+".");
            }
            //if target not equals
            return;
        }
        // if(sos>tar){
        //     return;
        // }
        int ele = arr[idx];
        String new_set = "";
        new_set = set+ele+", ";
        //ele will contribute
        if(sos+ele<=tar)
        //otherwise TLE.
        //if the sum is not greater than target, only then element will contribute.
        printTargetSumSubsets(arr,idx+1,new_set,sos+ele,tar);
        //ele will not contribute
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }

}