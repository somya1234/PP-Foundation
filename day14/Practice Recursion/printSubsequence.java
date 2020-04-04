// package day14.Practice

import java.util.Scanner;

// Recursion;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        getSS(str,"");
        System.out.println();
    }
    public static void getSS(String qsf, String asf){
        if(qsf.length()==0){
            if(asf.length()!=0){
                System.out.println(asf);
            }
            //return for both the cases when asf == "" and otherwise also.
            return;
        }
        char ch = qsf.charAt(0);
        qsf = qsf.substring(1);
        //not include the character
        getSS(qsf, asf);
        //include the first character
        getSS(qsf, asf+ch);
    }
}