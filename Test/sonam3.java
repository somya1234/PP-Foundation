import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int x=scn.nextInt();
         int i=0;
        while(i<arr.length-1){
            if(arr[i]==0 && arr[i+1]==0){
                x--;
                i=i+2;
            }
            else{
                i++;
            }
        }
        if(x<=0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }

}
