// package day14.Practice Recursion;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutationsfn(str,"");
        System.out.println();
    }
    public static void printPermutationsfn(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            //left --> till last element than i.
            //right --> after i to end.
            String right = str.substring(i+1);
            String roq = left + right;
            printPermutationsfn(roq, ans+ch);
        }
        return;
    }
}