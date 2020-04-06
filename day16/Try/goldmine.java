
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<m; j++)
                arr[i][j] = scn.nextInt();
        }
        int ans = goldMine(arr);
        System.out.println(ans);
    }
    public static int goldMine(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        
        for(int col = m-1; col>=0; col--){
            for(int row = n-1; row>=0; row--){
                if(col==m-1){
                    dp[row][col] = arr[row][col];
                } else if(row==n-1){
                    int d1 = arr[row-1][col+1];
                    int d2 = arr[row][col+1];
                    dp[row][col] = arr[row][col]+ Math.max(d1,d2);
                } else if(row == 0){
                    int d2 = arr[row][col+1];
                    int d3 = arr[row+1][col+1];
                    dp[row][col] = arr[row][col]+ Math.max(d2,d3);
                } else {
                    int d1 = arr[row-1][col+1];
                    int d2 = arr[row][col+1];
                    int d3 = arr[row+1][col+1];
                    int val = Math.max(d1,d2);
                    dp[row][col] = arr[row][col]+ Math.max(val,d3);
                }
                
            }
        }
        int maxVal = Integer.MIN_VALUE;
        for(int row=0; row<n; row++){
            if(dp[row][0]>maxVal){
                maxVal = dp[row][0];
            }
        }    
            
        return maxVal;
    }
}