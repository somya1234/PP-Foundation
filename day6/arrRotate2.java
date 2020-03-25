package day6;

import java.util.Scanner;

//A better approach to solve this question.

public class arrRotate2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int count = arr.length;
         k = k%count;
        if(k<0){
            k+=count;
        }
        int[] new_arr = new int[n];
        for(int i=0; i<arr.length; i++){
            int val = (arr.length-k+i)%arr.length;
            new_arr[i] = arr[val];
        }
        for(int i=0; i<new_arr.length; i++){
            System.out.print(new_arr[i]+" ");
        }
    }
}