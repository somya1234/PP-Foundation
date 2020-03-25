import java.io.*;
import java.util.*;

public class sumOfTwoArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int idx = 0; idx < arr1.length; idx++) {
            arr1[idx] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int idx = 0; idx < arr2.length; idx++) {
            arr2[idx] = scn.nextInt();
        }
//It can be done by converting it into numbers also but there would be a size limit in 
//integers. Integers can only store upto 32 .
//But we can have numbers upto 100 in any array.
        
        int n3 = Math.max(n1, n2);
        int[] arr3 = new int[n3];
        int carry = 0;

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = arr3.length-1;
        while(i>=0 || j>=0){
            //if we declare variable inside the if loop, then we can't access it later on.
            // i.e . outside the if loop.
            // if(i<0){
            //     int d1 = 0;
            // } else 
            //     int d1 = arr1[i];
            // if(j<0){
            //     int d2 = 0;
            // } else 
            //     int d2 = arr2[j];
            int d1 = i<0?0:arr1[i];
            int d2 = j<0?0:arr2[j];
            
            int sum = d1+d2+carry;
            if(sum>=10){
                carry = 1;
                sum = sum%10;
            } else {
                carry = 0;
            }
            arr3[k] = sum;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.println(carry);
        }
        for (int indx = 0; indx<arr3.length; indx++) {
            // arr3[i] = arr1[i] + arr2[i];
            System.out.println(arr3[indx]);
        }

    }

}