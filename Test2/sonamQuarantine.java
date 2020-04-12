import java.io.*;
import java.util.*;

public class Solution {

    //better option
    //substrings --> 
//abc --> a,ab,abc --> a
//b,bc --> only b
//c --> c

//example 2
// aba
//a, ab, aba --> a,aba
//b,bc --> b
//c --> c

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                  if(s.charAt(i)==s.charAt(j)){
                      count++;
                  }
            }
        }
        System.out.println(count);
    }
    
}