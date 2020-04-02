package day12.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class getKpc {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ans = printKpcFn(str);
        System.out.println(ans);
    }
    static String[] keys = {
        ".;",
        "abc",
        "def",
         "ghi",
         "jkl",
          "mno",
           "pqrs",
            "tu",
             "vwx",
              "yz"
    };
    public static ArrayList<String> printKpcFn(String str){

        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        str = str.substring(1);
        ArrayList<String> recCall = printKpcFn(str);
        ArrayList<String> result = new ArrayList<>();

        int keyIdx = Integer.parseInt(ch+"");
        String word = keys[keyIdx];

        for(int i=0; i<word.length(); i++){
            for( String val: recCall){
                result.add(word.charAt(i)+val);
            }
        }
        return result;
    }
}