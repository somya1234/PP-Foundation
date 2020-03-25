import java.io.*;
import java.util.*;

public class arrRotate{
  public static void display(int[] a){
    for(int i=0; i<=a.length-1; i++){
        System.out.print(a[i]+" ");
    }
  }

  public static void reverse(int[] a,int st, int end){
    int left = st;
    int right = end;
    while(left<right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;

        left++;
        right--;
    }
    //we do not need to return anything here.
    // as the changes are made into the arr itself which is passed into it 
    //and it is accessing its memory.
  }

  public static void rotate(int[] arr, int k){
    // write your code here
    int n = arr.length;
    k = k%n;
    if(k<0){
        k=k+n;
    }
    reverse(arr,0,arr.length-k-1);
    reverse(arr,arr.length-k,arr.length-1);
    reverse(arr,0,arr.length-1);

  }
 

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}