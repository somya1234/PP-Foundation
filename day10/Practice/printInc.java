import java.util.Scanner;

public class printInc{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Inc(n);
    }
    public static void Inc(int n){
        if(n==0){
            return;
        }
        Inc(n-1);
        System.out.println(n);
    }
}