import java.util.Scanner;

public class printDecInc{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        DecInc(n);
    }
    public static void DecInc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        DecInc(n-1);
        System.out.println(n);
    }
}