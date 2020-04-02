import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> result = gss(str,"");
        System.out.println(result);

    }

    public static ArrayList<String> gss(String str, String ans) {
        // if(str==""){
        //     ArrayList<String> old_list = new ArrayList<>();
        //     return old_list;
        // }
        // ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list = null;
        if(str == ""){
            if(ans!=""){
                list.add(ans);
                return list;
            }
        }
        
        char ch = str.charAt(0);
        str = str.substring(1);
        
        list = gss(str,ans);
        list = gss(str,ans+ch);
        return list;
    }

}