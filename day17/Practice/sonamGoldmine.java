import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
        int m=scn.nextInt();
        int gold[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                gold[i][j]=scn.nextInt();
            }
        }
        //System.out.println(goldmine(gold));
        int dp[][]=new int[n][m];
      System.out.println(findmax(gold,dp));
        
    }
    //1. memoization
    public static int goldminememo(int gold[][],int dp[][],int i,int j){
        int n=gold.length;
        int m=gold[0].length;
        if(i>n || j>m){
            return 0;
        }
        if(j==m-1){
            return gold[i][j];
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(i==0){
            int x=goldminememo(gold,dp,i+1,j+1);
            int y=goldminememo(gold,dp,i,j+1);
            return dp[i][j]=Math.max(x,y)+gold[i][j];
        }
        else if(i==n-1){
             int x=goldminememo(gold,dp,i,j+1);
            int y=goldminememo(gold,dp,i-1,j+1);
            return dp[i][j]=Math.max(x,y)+gold[i][j];
        }
        else{
            int x=goldminememo(gold,dp,i,j+1);
            int y=goldminememo(gold,dp,i-1,j+1);
             int z=goldminememo(gold,dp,i+1,j+1);
            return dp[i][j]=Math.max(x,Math.max(y,z))+gold[i][j];
        }
        
        
    }
    public static int findmax(int gold[][],int dp[][]){
        int n=dp.length;
        int m=dp[0].length;
        int max=dp[0][0];
         for(int i=0;i<n;i++){
            max=Math.max(goldminememo(gold,dp,i,0),max);
         }
         return max;
    }
    //2.Tabulation
    public static int goldmine(int gold[][]){
        int n=gold.length;
        int m=gold[0].length;
        int dp[][]=new int[n][m];
        for(int j=m-1;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if(j==m-1){
                    dp[i][j]=gold[i][j];
                }
                
                else if(i==n-1){
                    dp[i][j]=Math.max(dp[i-1][j+1],dp[i][j+1])+gold[i][j];
                }
                else if(i==0){
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+gold[i][j];
                }
                else{
                    dp[i][j]=Math.max(Math.max(dp[i][j+1],dp[i+1][j+1]),dp[i-1][j+1])+gold[i][j];
                }
            
                
            }
        }
        int max=dp[0][0];
        
        for(int i=0;i<n;i++ ){
            max=Math.max(dp[i][0],max);
        }
       
        return max;
    }
    

}