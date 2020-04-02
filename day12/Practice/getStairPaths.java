package day12.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairPaths {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPathFn(n);
        System.out.println(ans);
    }
    public static ArrayList<String> getStairPathFn(int n){
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(n<0){
            ArrayList<String> invalid = new ArrayList<>();
            return invalid;
        }
        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> len1 = getStairPathFn(n-1);
         for(String val:len1){
            result.add("1"+val);
        }
        ArrayList<String> len2 = getStairPathFn(n-2);
          for(String val:len2){
            result.add("2"+val);
        }
        ArrayList<String> len3 = getStairPathFn(n-3);
        
        for(String val:len3){
            result.add("3"+val);
        }

       
      
        return result;
    }
}