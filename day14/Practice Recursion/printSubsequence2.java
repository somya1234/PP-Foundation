import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String ques = scn.nextLine();
        printSS(ques,"");
        //when there is noinput or blank string is passed,
        //but the pepcoding compiler is forcing it give atleast one println
        //otherwise it won't accept.
        System.out.println();
    }

    public static void printSS(String qsf, String asf) {
        if(qsf.length()==0){
            //asf.length is important to avoid the case of empty string
            //because we are not printing that empty string 
            //which comes in the case of subset.
            if(asf.length()!=0)
                System.out.println(asf);
            return;
        }
        char ch = qsf.charAt(0);
        qsf = qsf.substring(1);
        //char is not included
        printSS(qsf,asf);
        
        //char is included
        printSS(qsf,asf+ch);
       
    }

}