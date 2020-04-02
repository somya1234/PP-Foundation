package day12.Practice;

import java.util.Scanner;

public class printKpc {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKpcFn(str,"");
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
    public static void printKpcFn(String que, String ans){
        //we cannot write (que=="")
        //we have to use .length() here.
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        //for eg = 234 == que
        char ch = que.charAt(0);
        //gives 2
        String roq = que.substring(1);
        //gives 34


       //we can convert the character directly into the integer, but then it will get
        //convert into the ascii value of character which is 48.
        //so we will have to subtract 48 from it.
        //to save time we can first convert character into string, i.e. by adding an empty 
        //string "" and then parse it into the integer to access the index.
        int keyIdx = Integer.parseInt(ch+"");
        //gives 2 in integer as the user entered a string


        //in char --> ascii of "number" - ascii of "0"
        //string to integer conversion
        String word = keys[keyIdx];
        //gives def.

        for(int i=0; i<word.length(); i++){
            printKpcFn(roq, ans+ word.charAt(i));
            //gives (34, d)
            /* and then the loop goes on for 3 */
        }
    }
}