import java.util.Scanner;

public class ArrayToInteger{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        String str = "";
        for(int i=0; i<arr.length; i++){
            str+=arr[i];
        }
        int num = Integer.parseInt(str);
        System.out.println(str);
    }
}