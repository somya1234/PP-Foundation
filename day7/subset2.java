import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        n = arr.length;
        int maxSubsets = (int)Math.pow(2,n);
        int subset = 0;
        
        while(subset<maxSubsets){
            int temp = subset;
            
            //binary of the element subset
            int k = 0;
            String ans = "";
            int idx = arr.length-1;
            while(k<n){
                int rem = temp%2;
                if(rem==0){
                    ans = "-"+"\t"+ans;
                } else {
                    ans=arr[idx]+"\t"+ans;
                }
                idx--;
                temp/=n;
                k++;
            }
            subset++;
            System.out.println(ans);
        }
    }
}