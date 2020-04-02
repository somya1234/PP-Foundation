import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
       int totalcount =  printPermutations(str,"");
        System.out.println(totalcount);
    }

    public static int printPermutations(String str,String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return 1;
        }
        int totalcount = 0;
     for(int i=0; i<str.length(); i++ ){
         //i --> idx
         char ch = str.charAt(i);
         String left = str.substring(0,i);
         String right = str.substring(i+1);
         //rest or question --> roq
         String roq = left+right;
         
        totalcount+= printPermutations(roq,ans+ch);
    }
    return totalcount;
    }

}