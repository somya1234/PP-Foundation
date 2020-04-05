import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = printStairPaths(0,n,0);
        System.out.println(ans);
    }
    public static int printStairPaths(int n, int total, int countPaths){
        if(n==total){
            countPaths+=1;
            return countPaths;
        }
        if(n>total){
            return 0;
        }
        // if(dp[n]!=0){
        //     return dp[n];
        // }
        Paths += printStairPaths(n+1, total,countPaths);
        Paths += printStairPaths(n+2, total,countPaths);
        Paths += printStairPaths(n+3, total,countPaths);
        // dp[n] = 
        return Paths;
        // return recAns;
    }

}