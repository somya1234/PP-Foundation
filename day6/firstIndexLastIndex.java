import java.io.*;
import java.util.*;

public class firstIndexLastIndex{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn  = new Scanner(System.in);
   int n = scn.nextInt();
   int[] arr = new int[n];
   for(int i=0; i<arr.length; i++){
       arr[i] = scn.nextInt();
   }
   int d = scn.nextInt();
   int[] new_arr = new int[n];
   int idx = 0;
   int count = 0;
   Boolean flag = true;
   for(int i=0; i<arr.length; i++){
       if(arr[i]==d){
           new_arr[idx]= i;
           flag = false;
           idx++;
           count++;
       }
   }
   if(flag){
       // if the element is not available in the array.
       System.out.println(-1);
       System.out.println(-1);
   } else {
       System.out.println(new_arr[0]);
       //for first time count = 1; but it at first and laxt index,
       //which is same.
       System.out.println(new_arr[0]+count-1);
   }
 }

}