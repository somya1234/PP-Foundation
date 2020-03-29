import java.util.Scanner;

public class firstIndex{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int ans = firstInd(arr,0,d);
        System.out.println(ans);
    }
    public static int firstInd(int[] arr, int idx , int d){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == d){
            return idx;
        }
        int ans = firstInd(arr,idx+1, d);
        return ans;
    }
}