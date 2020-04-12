package Test2;

import java.util.Scanner;

public class quarantine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int n = str.length();

        int count = 0;
        if (str.charAt(0) == str.charAt(str.length()-1)){
            int lens = str.length();
            count+=1+lens;
        }
        // System.out.println(count);
        ss(str,count);
    }
    public static void ss(String str,int count){
        int n = str.length()-1;
        
        if(str.length()==0){
            System.out.println(count);
            return;
        }

        String temp1 = str.substring(1);
        int n1 = temp1.length();
        String temp2 = str.substring(0, n);
        int n2 = temp2.length();
        char ch1= temp1.charAt(0);
        char ch2 = temp1.charAt(n1-1);
        char ch3= temp2.charAt(0);
        char ch4 = temp2.charAt(n2-1);
        if(ch1 == ch2){
            count++;
            str = str.substring(1); 
            // substring(str, count);
        } else if(ch3 == ch4){
            count++;
            str = str.substring(0, n);
        } else {
            str = str.substring(1); 
        }
        ss(str, count);
        

    }
}