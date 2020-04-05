import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = printStairPaths(0,n, 0, new int[n]);
        System.out.println(ans);
    }
    public static void printStairPaths(int n, int total, int countPaths, int[] result){
        if(countPaths==total){
            System.out.println(countPaths);
            // return;
        }
        if(countPaths>total){
            return;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int recAns = printStairPaths(n+1, total, countPaths+1, result);
        int recAns +=printStairPaths(n+2, total, countPaths+2, result);
        printStairPaths(n+3, total, countPaths+3, result);
        // dp[n] = 
        return recAns;
    }

}