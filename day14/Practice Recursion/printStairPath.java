// package day14.Practice

import java.util.Scanner;

// Recursion;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPaths(n,"");
        System.out.println();
    }
    public static void printPaths(int qsf, String asf){
        if(qsf==0){
            System.out.println(asf);
            //we can't make the condition as for(qsf<=0) and then writing return statement
            //as it will then print all the paths for which qsf<=0.
            // return;
        }
        if(qsf<0){
            //we have to put it return when n=1 but it will run for all 
            // L1, L2 and L3. So, it will go negative while traversing so 
            //we have to return there.
            return;
        }
        printPaths(qsf-1, asf+"1");
        printPaths(qsf-2, asf+"2");
        printPaths(qsf-3, asf+"3");
        return;
    }
}