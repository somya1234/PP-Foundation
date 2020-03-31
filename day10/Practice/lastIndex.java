import java.util.Scanner;

public class lastIndex{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int ans = lastInd(arr,0,d);
        System.out.println(ans);
    }
    public static int lastInd(int[] arr, int idx , int d){
        if(idx == arr.length){
            return -1;
        }
        int ans = lastInd(arr,idx+1,d);
        if(ans == -1){
            if(arr[idx] == d){
                return idx;
            }
        } else {
            return ans;
        }

        //or 
        // if(ans == -1){
            // if(arr[idx]==x){
            //     return (int)Math.max(idx,ans);
            // } else {
            //     return -1;
            // }
            // }
        
        return ans;
    }
}