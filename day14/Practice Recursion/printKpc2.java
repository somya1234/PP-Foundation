import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
       
        printKPC(str, "");
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

    public static void printKPC(String ques, String asf) {
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        //we can convert the character directly into the integer, but then it will get
        //convert into the ascii value of character which is 48.
        //so we will have to subtract 48 from it.
        //to save time we can first convert character into string, i.e. by adding an empty 
        //string "" and then parse it into the integer to access the index.
        int keyIdx = Integer.parseInt(ch+"");
        //in char --> ascii of "number" - ascii of "0"
        //string to integer conversion
        String word = keys[keyIdx];
        
        for(int idx = 0; idx<word.length(); idx++){
            printKPC(roq,asf+word.charAt(idx));
        }
    }

}