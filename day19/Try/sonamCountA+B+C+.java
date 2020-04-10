import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         String s=scn.nextLine();
         System.out.println(subsequence(s));
    }
    
    public static int subsequence(String s){
        int n=s.length();
        int dp[][]=new int[3][n];
        if(s.charAt(0)=='a'){
            dp[0][0] = 1;
        }
        for(int i=1;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                dp[0][i] = 1+2*(dp[0][i-1]);
            } else {
                dp[0][i] = dp[0][i-1];
            }
            if(ch=='b'){
                dp[1][i] = dp[0][i-1]+ 2*(dp[1][i-1]);
            } else{
                dp[1][i] = dp[1][i-1];
            }
            if(ch=='c'){
                dp[2][i] = dp[1][i-1] + 2*(dp[2][i-1]);
            } else {
                dp[2][i] = dp[2][i-1];
            }
        }
      
          return dp[2][n-1];
        
    }
}