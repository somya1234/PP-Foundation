import java.util.*;
  
  public class pythagoreanTriplet{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    Boolean result = false;
    
    result = result || (a*a == b*b+c*c) || (b*b == a*a+c*c) || (c*c == a*a+b*b);
    System.out.println(result);
    // if(a>b && a>c){
    //     Boolean ans = (a*a == b*b+c*c);
    //     System.out.println(ans);
        
    // }
    //  if(b>a && b>c){
    //     System.out.println(Boolean.valueOf(b*b == a*a+c*c));
        
    // }
    //  if(c>a && c>b){
    //     System.out.println(Boolean.valueOf(c*c == a*a+b*b));
        
    // }
   }
  }