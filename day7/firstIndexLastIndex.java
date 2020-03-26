import java.util.Scanner;

public class firstIndexLastIndex{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int first = -1;
        int last = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == d){
                if(first == -1){
                    //if first == -1, then no element has found till now,
                    //so update both for the first element found with the index.
                    first = i;
                    last = i;
                } else {
                    //if it's not the first time that we have found the element in the array,
                    //update only the last value.
                    last = i;
                }
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}