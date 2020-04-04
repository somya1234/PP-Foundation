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
        if(n%2!=0){
            System.out.println("false");
        }else{
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
            int maxstud = Integer.MIN_VALUE;
            for(int k=0;k<max;k++){
                if(res[k]>maxstud){
                    maxstud = res[k];
                }
            }
            int countdiv =0;
            int pointflag = 0;
            for(int i=2;i<maxstud;i++){
                for(int j=0;j<max;j++){
                    if(res[j]%i==0){
                        countdiv++;
                    }
                }
                if(countdiv==max){
                    pointflag = 1;
                    break;
                }
            }
            if(pointflag == 1){
                System.out.println("true");
            }else{
            System.out.println("false");
            }
        }
        } 
    }
}