import java.io.*;
import java.util.*;

public class phoneBooth {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int k=scn.nextInt();
        if(n>=2)
            if(arr[0]==0&&arr[1]==0)
            {
                k--;
                arr[0]=1;
            }
        for(int i=1;i<n-1&&k>=0;i++)
        {
            if(arr[i-1]==0&&arr[i+1]==0&&arr[i]==0)
            {
                arr[i]=1;
                k--;
            }
        }
        if(arr[n-1]==0&&arr[n-2]==0)
        {
            arr[n]=1;
            k--;
        }
        if(k<=0)
            System.out.println("true");
        else
            System.out.println("false");
        
    }
}