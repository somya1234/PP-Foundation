import java.util.Scanner;

public class printDec{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Dec(n);
    }
    public static void Dec(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Dec(n-1);
    }
}