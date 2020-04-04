// package day14.Practice

import java.util.Scanner;

// Recursion;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tohid1 = scn.nextInt();
        int tohid2 = scn.nextInt();
        int tohid3 = scn.nextInt();
        printtoh(n,tohid1,tohid2,tohid3);
    }
    public static void printtoh(int n, int src, int dest, int helper){
        if(n==0)
        return;
        printtoh(n-1, src, helper, dest);
        System.out.println(n+"["+src+" -> "+dest+"]");
        printtoh(n-1, helper, dest, src);
    }
}