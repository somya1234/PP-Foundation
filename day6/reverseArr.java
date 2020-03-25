import java.io.*;
import java.util.*;

public class reverseArr{
  public static void display(int[] a){
    for(int i=0; i<=a.length; i++){
        System.out.print(a[i]+" ");
    }
  }

  public static void reverse(int[] a){
    int left = 0;
    int right = a.length-1;
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

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i=0; i<a.length; i++){
        a[i] = scn.nextInt();
    }
   
    reverse(a);
    display(a);
 }

}