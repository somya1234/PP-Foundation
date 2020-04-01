import java.io.*;
import java.util.*;

public class printPermutation{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str,"");

    }

    public static void printPermutations(String str,String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
     for(int i=0; i<str.length(); i++ ){
         char ch = str.charAt(i);
         String roq = str.substring(i+1);
         printPermutations(roq,ans+ch+roq);
     }  
    }

}