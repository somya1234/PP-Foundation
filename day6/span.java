import java.io.*;
import java.util.*;

public class span {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        //always save maxValue as min_value property of Integer.
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        //always keep min value using this function of integer.
        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        int diff = maxValue - minValue;
        System.out.println(diff);
    }

}