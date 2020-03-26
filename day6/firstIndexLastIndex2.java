import java.io.*;
import java.util.*;

//A better Approach-

public class firstIndexLastIndex2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        //there is no need to store the index in new_array.
        // we can store the element in temp variable also.

        //   int[] new_arr = new int[n];
        //   int idx = 0;
        int count = 0;
        int temp = 0;
        Boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                flag = false;
                //   new_arr[idx]= i;
                //   idx++;
                count++;
                if(count == 1){
                    temp = i;
                }
            }
        }
        if (flag) {
            // if the element is not available in the array.
            System.out.println(-1);
            System.out.println(-1);
        } else {
            System.out.println(temp);
            //for first time count = 1; but it at first and laxt index,
            //which is same.
            System.out.println(temp + count - 1);
        }
        
    }

}