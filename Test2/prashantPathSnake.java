import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();      // numbers on board
        int m = scn.nextInt();  //faces of dice
        
        System.out.println(countWaysToTraverse(n,m));
        System.out.println(waysToTraverse(n,m));
        ArrayList<String> ways = waysToTraverse(n,m);
        for(String val:ways)
                System.out.println(val);
    }
    
    public static long countWaysToTraverse(int n, int m) {
        if( n == 0)
                return 1;
        
        long ways = 0;
        for(int idx=1;idx<=m;idx++) {
            if( n-idx >= 0 ) {
                ways += countWaysToTraverse(n-idx,m);
            }
        }
        return ways;
    }
    
    public static ArrayList<String> waysToTraverse(int n, int m) {
        if(n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> ways;
        ArrayList<String> totalWays = new ArrayList<>();
        for(int idx=1;idx<=m;idx++) {
            if( n-idx >= 0 ) {
                ways = waysToTraverse(n-idx,m);
                for(String val:ways)
                        totalWays.add( idx+val );
            }
        }
        return totalWays;
    }
}