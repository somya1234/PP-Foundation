package Test2;

import java.util.Scanner;

public class linearCheck {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        boolean ans = true;
        for(int i=0; i<n; i++){
            if(arr[i][0]==0 && arr[i][1]==0){
                ans = false;
            }
            if(arr[i][0]!=0 && arr[i][1]!=0){
                ans = false;
            } else if(arr[0][0]==0){
                for(int idx=1; idx<n; idx++){
                    if(arr[idx][0]!=0)
                        ans =  false;
                }
            } else if(arr[0][1]==0){
                for(int idx=1; idx<n; idx++){
                    if(arr[idx][1]!=0)
                        ans =  false;
                }
            }
        }
        if(ans == true)
        System.out.println("YES");
        else
            System.out.println("NO");
    }
}

//test case 3 and 5.