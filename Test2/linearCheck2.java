import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean result1 = true;
        boolean result2 = true;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<2; j++){
                if(arr[i][0]!=arr[i+1][0]){
                    result1 = false;
                }
                if(arr[i][1]!=arr[i+1][1]){
                    result2 = false;
                }
            }
        }
        boolean result= result1||result2;
        if(result){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}