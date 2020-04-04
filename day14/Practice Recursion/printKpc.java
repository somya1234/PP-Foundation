// package day14.Practice Recursion
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKpcfn(str,"");
        System.out.println();
    }
    static String[] keys = {
        ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"
    };
    public static void printKpcfn(String qsf, String asf){
        if(qsf.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = qsf.charAt(0);
        qsf = qsf.substring(1);
        int keyIdx = Integer.parseInt(ch+"");
        String word = keys[keyIdx];
        for(int i=0; i<word.length(); i++){
            printKpcfn(qsf, asf+word.charAt(i));
        }
        return;
    }
}