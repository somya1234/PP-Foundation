import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = climbPaths(n,new int[n+1]);
        System.out.println(ans);
    }
    public static int climbPaths(int n, int[] db){
        if(n==0){
            return 1;
        }
        int totalWays = 0;
        if(db[n]!=0){
            return db[n];
        }
        for(int step=1; step<=3; step++){
            if(n-step>=0){
                totalWays+=climbPaths(n-step,db);
            }
        }
        //resource filling
        db[n] = totalWays;
        return db[n];
    }

}