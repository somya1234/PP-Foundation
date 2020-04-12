import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        System.out.println(countSpecialSubstrings(str,""));
    }
    
    public static int countSpecialSubstrings(String ques, String asf) {
        if(ques.length() == 0 ) {
            if( asf.length() > 0 && asf.charAt(0) == asf.charAt(asf.length()-1) ) {
                return 1;
            }
            else
                return 0;
        }
        
        int counter = 0;
        char ch = ques.charAt(0);
        ques = ques.substring(1);
        if(asf.length() == 0) {
            counter += countSpecialSubstrings(ques,asf+ch);
            counter += countSpecialSubstrings(ques,asf);    
        }
        else {
            counter += countSpecialSubstrings(ques,asf+ch);
            counter += countSpecialSubstrings("",asf);    
        }
        
        return counter;
    }
}