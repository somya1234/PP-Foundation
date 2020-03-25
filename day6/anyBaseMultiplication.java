import java.util.*;

public class anyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

public static int getSum(int n1,int n2, int b){
    int carry = 0;
    int p =1; 
    int rv = 0;
    while(n1>0 || n2>0 || carry>0){
        int rem1 = n1%10;
        int rem2 = n2%10;
        int sum = rem1+rem2+carry;
        carry = sum/b;
        sum = sum%b;
        rv+=p*sum;
        p*=10;
        n1/=10;
        n2/=10;
    }
    return rv;
}

public static int multiplyWithSingleDigit(int n1, int d, int b){
    int carry = 0;
    int p =1;
    int rv= 0;
    while(n1>0 || carry>0){
        int rem = n1%10;
        int mul = (rem*d)+carry;
        carry = mul/b;
        mul = mul%b;
        rv+= p*mul;
        p*=10;
        n1/=10;
    }
    return rv;
}

 public static int getProduct(int b, int n1, int n2){
     int rv = 0;
     int p =1;
     while(n2>0){
         int d = n2%10;
         int mulSingleDigit = multiplyWithSingleDigit(n1,d,b);
         // Important thing here is do not do rv+=
         //because we are already getting sum of two numbers in rv.
         // no need to do sum again.
         rv= getSum(rv,mulSingleDigit*p,b);
         p*=10;
         n2/=10;
     }
     return rv;
 }

}