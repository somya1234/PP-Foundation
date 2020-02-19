import java.util.*;
       
       public class pattern1{
       
       public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
       
            // write ur code here
            int n = scn.nextInt();
            int st = 1;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=st; j++){
                    System.out.print("*\t");
                }
                System.out.println();
                st++;
            }
       
        }
       }