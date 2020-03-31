import java.util.Scanner;

public class allIndices{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int[] ans = allIndexArr(arr,0,d,0);
        for(int i=0; i<ans.length; i++){
        System.out.println(ans[i]);
        }
    }
    public static int[] allIndexArr(int[] arr, int idx , int d, int fsf){
        if(idx == arr.length){
            //this is a dynamic array as it creates an array for any size input of fsf
            int[] base = new int[fsf];
            return base;
            //it returns a memory location to which new_arr will point further.
        }
        int[] new_arr = null;
        if(arr[idx] == d){
            //fsf is basically count (or element found so far)
            //it gets increment if the element is found
        allIndexArr(arr, idx+1, d, fsf+1);
        //post work-->
        //storing the last index at last position of array.
        new_arr[fsf] = idx;
        } else {
            allIndexArr(arr, idx+1, d, fsf);
        }
        return new_arr;
    }
}