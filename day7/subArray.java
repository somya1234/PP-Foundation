import java.util.Scanner;

public class subArray{

    public static void print(String new_str){
        System.out.println(new_str);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    for(int i=0; i<arr.length; i++){
        String new_str = "";
        for(int j=i; j<arr.length;j++){
            new_str+=arr[j]+"\t";
            print(new_str);
        }
    }
    }
}