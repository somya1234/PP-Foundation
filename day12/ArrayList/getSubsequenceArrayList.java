import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> result = gss(str);
        System.out.println(result);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        
       ArrayList<String> rof = gss(str.substring(1));
       ArrayList<String> myresult = new ArrayList<>();
       
       //directly include the result in myresult 
       for(String val:rof){
           myresult.add(val);
       }
       char ch = str.charAt(0);
       for(String val:rof){
           myresult.add(ch+val);
       }
        return myresult;
    }

}