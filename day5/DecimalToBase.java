import java.util.Scanner;

public class DecimalToBase{

    public static int DecimalToBaseConversion(int n, int b){
        int rv = 0;
        int p = 1;
        while(n!=0){
            int rem = n%b;
            rv+=rem*p;
            n/=b;
            p*=10;
        }
        return rv;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int rv = DecimalToBaseConversion(n,b);
        System.out.println(rv);
    }
}