package day6;

import java.util.Scanner;

public class arrDiff {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        int n3 = Math.max(n1,n2);
        int[] arr3 = new int[n3];
        int borrow = 0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = arr3.length-1;
        while(j>=0){
            int d1 = i<0?0:arr1[i];
            System.out.println("d1"+d1);
            int d2 = arr2[j];
            System.out.println("d2"+d2);
            int diff = d2-d1-borrow;
            System.out.println("diff"+diff);
            if(diff<0){
                diff+=10;
                borrow = 1;
            } else{
                borrow = 0;
            }
            arr3[k] = diff;
            i--;
            j--;
            k--;
        }
        for(int idx = 0; idx<arr3.length; idx++){
            System.out.println(arr3[idx]);
        }
    }
}