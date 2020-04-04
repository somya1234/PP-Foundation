import java.util.Scanner;

public class linearPower{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int p = calculatePower(x,n);
        System.out.println(p);
    }
    public static int calculatePower(int x, int n){
        if(n==0){
            return 1;
        }
        int p = calculatePower(x, n-1);
        int pow = p*x;
        return pow;
    }
}