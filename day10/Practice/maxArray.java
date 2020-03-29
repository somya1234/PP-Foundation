import java.util.Scanner;

public class maxArray{
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxArr(arr,0);
        System.out.println(max);
    }
    public static int maxArr(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        int ele = arr[idx];
        int maxRec = maxArr(arr, idx+1);
        if(ele>maxRec){
            maxRec = ele;
        }
        return maxRec;
    }
}