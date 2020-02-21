import java.util.*;
  
  public class AnyBaseToDecimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int rv = 0;
      int p = 1;
      while(n!=0){
          int rem = n%10;
          rv+= rem*p;
          n/=10;
          p*=b;
      }
      return rv;
   }
  }