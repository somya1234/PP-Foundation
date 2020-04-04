package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fieldTrip3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] class_arr = new int[n];
        for(int i=0; i<class_arr.length; i++){
            class_arr[i] = scn.nextInt();
        }
           
    if(n%2!=0){
        System.out.println(false);
    } else {
        System.out.println(true);
    }
    Set<Integer> set = new HashSet<>();
    for(int t:class_arr){
        set.add(t);
    }
    System.out.println(set);
    }
}