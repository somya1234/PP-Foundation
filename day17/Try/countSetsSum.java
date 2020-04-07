package day17.Try;

import java.util.Scanner;

//find all the sets that sums upto 16.

public class countSetsSum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        int ans = count_sets(arr,tar);
    }
    public static int count_sets(int[] arr, int target){
        return rec(arr,target,arr.length-1);
    }
    public static int rec(arr,total,i){
        if(total == 0)
            //base case or given in q
            return 1;
        else if(total<0)
        //no negative number
            return 0;
        else if(i<0)
        //base case
            return 0;
        else if(total<arr[i]){
            return rec(arr,total,i-1);
        } else {
            return rec(arr,total-arr[i],i-1)+ rec(arr,total,i-1);
        }
    }

}