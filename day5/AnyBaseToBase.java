import java.util.*;
  
  public class AnyBaseToBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
  
      int d = getValue(n, b1, b2);
      System.out.println(d);
   }
  
   public static int getValue(int n, int b1, int b2){
       // write your code here
       int decimalVal = baseToDecimal(n,b1);
       int newBaseval = DecimalToBase(decimalVal,b2);
       return newBaseval;
   }
  
  
    public static int baseToDecimal(int n, int b1){
        int p = 1;
        int rv = 0;
        while(n!=0){
            int rem = n % 10;
            rv+= rem * p;
            p *= b1;
            n /= 10;
        }
        int decimalVal = rv;
        return decimalVal;
    }
   
   public static int DecimalToBase( int n, int b2){
       int p = 1;
       int rv = 0;
       while(n!=0){
           int rem = n % b2;
           rv+= rem * p;
           p*=10;
           n /= b2;
       }
       int newBaseval = rv;
       return newBaseval;
   }
  }