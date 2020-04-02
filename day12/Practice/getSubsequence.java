package day12.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = getSubsequenceFn(str);
        System.out.println(ans);
    }
    public static ArrayList<String> getSubsequenceFn(String str){
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        ArrayList<String> recArr = getSubsequenceFn(str);
        ArrayList<String> result = new ArrayList<>();
        for(String val:recArr){
            result.add(val);
        }
        
        for(String val:recArr){
            result.add(ch+val);
        }
    }
}