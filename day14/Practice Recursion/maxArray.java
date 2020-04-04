package day14.Practice Recursion;
import java.util.Scanner;


public class maxArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int max = maxArray(arr,0);
        System.out.println(max);
    }
    public static int maxArray(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        int ele = arr[idx];
        int recEle = maxArray(arr, idx+1);
        if(ele>recEle){
            recEle = ele;
        }
        return recEle;
    }
}