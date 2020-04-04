import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int k = scn.nextInt();
        if(n==m&&n%2!=0){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if((i+j)%2==0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            
            System.out.println();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==n%2||j==m%2){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }else{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if((i+j)%2==0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
            
            System.out.println();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i==n%2||j==m%2){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        
        
        }
    }
}