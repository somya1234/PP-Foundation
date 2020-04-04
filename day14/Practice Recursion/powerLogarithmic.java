package day14.Practice Recursion;
import java.util.Scanner;

public class powerLogarithmic {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = calculatePower(x,n);
        System.out.println(p);
    }
    public static int calculatePower(int x, int n){
        if(n==0 || x==1){
            return 1;
        }
        int p = calculatePower(x, n/2);
        int pow = p*p;
        if(n%2!=0){
            pow = pow*x;
        }
        return pow;
    }
}