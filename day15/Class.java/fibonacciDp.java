import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    //length of the new array is n+1.
    int ans = fibonacci(n, new int[n+1]);
    System.out.println(ans);
 }
 public static int fibonacci(int n, int[] result){
     if(n==0 || n==1){
         return n;
     }
     //if the element in the array is not 0.
     //i.e. the element is stored in the array.
     if(result[n]!=0){
         return result[n];
     }
     int fibN1 = fibonacci(n-1,result);
     int fibN2 = fibonacci(n-2,result);
     int fib = fibN1 + fibN2;
     //store the value in the array.
     result[n] = fib;
     
     return fib;
 }

}