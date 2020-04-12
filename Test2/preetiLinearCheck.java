mport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar1[] = new int[n];
        int ar2[] = new int[n];
        
        for(int i=0;i<n;i++){
            ar1[i] = sc.nextInt();
            ar2[i] = sc.nextInt();
        }
        
        check(ar1,ar2,n);
    }
    
    public static void check(int ar1[],int ar2[],int n){
        // int n = ar1.length;
        int sum1=0,sum2=0;
        for(int i=0;i<n-1;i++){
           if(ar1[i]==ar1[i+1]){
               sum1++;
           } 
        if(ar2[i]==ar2[i+1]){
            sum2++;
        }
        }
        // System.out.println(sum1 +" "+sum2);
        if(sum1==n-1 || sum2==n-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}