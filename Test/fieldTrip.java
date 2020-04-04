import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int res[] = new int[max];
        int classtud = 1;
        
        for(int j=0;j<max;j++){
            int total = 0;
            for(int i=0;i<n;i++){
                if(arr[i]==classtud){
                    total++;
                }
            }
            res[j] = total;
            classtud++;
        }
        // int maxstud = Integer.MIN_VALUE;
        // for(int k=0;k<max;k++){
        //     if(res[k]>maxstud){
        //         maxstud = res[k];
        //     }
        // }
        int equal = res[0];
        int flag = 0;
        for(int h=0;h<max;h++){
            if(res[h]==equal){
                flag++;
            }
        }
        
        if(flag == max){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
}