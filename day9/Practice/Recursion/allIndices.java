import java.util.Scanner;

public class allIndices{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] new_arr = getAllIndices(arr,0,x,0);
        for(int i=0; i<new_arr.length; i++){
            System.out.println(new_arr[i]);
        }
    }
    public static int[] getAllIndices(int[] arr, int idx, int x, int fsf){
        //fsf is basically element found so far.
        if(arr.length == idx){
            int[] base_arr = new int[fsf];
            //returning the address of the base array.
            return base_arr;
        }
        int[] result = null;
        if(arr[idx]==x){
            result = getAllIndices(arr, idx+1, x, fsf+1);
            result[fsf] = idx;
        } else{
            result = getAllIndices(arr, idx+1, x, fsf);
        }
        return result;
    }
}
