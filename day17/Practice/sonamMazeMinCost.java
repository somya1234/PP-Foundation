import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int maze[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j]=scn.nextInt();
            }
        }
        int dp[][]=new int[n][m];
        System.out.println(mincostmemo(maze,dp,0,0));
      
        
        
    }
    //1.memoization
    public static int mincostmemo(int maze[][],int dp[][],int sc,int sr){
        int dr=maze.length-1;
        int dc=maze[0].length-1;
        if(sr>dr|| sc>dc){
            return Integer.MAX_VALUE;
        }
        if(sr==dr && sc==dc){
           
            return maze[sr][sc];
        }
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        
    int x=mincostmemo(maze,dp,sc,sr+1);
        
    int y=mincostmemo(maze,dp,sc+1,sr);
        
        return dp[sr][sc]=Math.min(x,y)+maze[sr][sc];
    }
    //2.tabulation
    public static int mincost(int maze[][]){
        int n=maze.length;
        int m=maze[0].length;
        int dp[][]=new int[n][m];
        dp[n-1][m-1]=maze[n-1][m-1];
        for(int i=m-2;i>=0;i--){
            dp[n-1][i]=maze[n-1][i]+dp[n-1][i+1];
        }
        for(int j=n-2;j>=0;j--){
            dp[j][m-1]=maze[j][m-1]+dp[j+1][m-1];
        }
        
        for(int i=n-2;i>=0;i--){
            for(int j=m-2;j>=0;j--){
                
                dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+maze[i][j];
                
            }
        }
        
        return dp[0][0];
    }
    

}