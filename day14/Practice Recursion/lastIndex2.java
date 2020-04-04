import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int ans = lastIndex(arr,0,d);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length){
            return -1;
        }
        int ans = lastIndex(arr,idx+1,x);

        // if(ans == -1){
        if(arr[idx]==x){
            return (int)Math.max(idx,ans);
        } else {
            return -1;
        }
        // }
        return ans;
    }

}