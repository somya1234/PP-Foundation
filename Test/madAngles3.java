import java.io.*;
import java.util.*;

public class madAngles3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN/
        . Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int i=0;
        while(i<n)
        {
            
            for(int j=0;j<n;j++)
                System.out.print("*");
            System.out.print("  ");//2 fixed spaces
            
            //i spaces
            for(int j=0;j<i;j++)
                System.out.print(" ");
            
            for(int j=0;j<2*(n-i-1)+1;j++)
                System.out.print("*");
            System.out.print("  ");//2 fixed spaces
            
            for(int j=0;j<2*i+1;j++)
                System.out.print("*");
            System.out.print("  ");//2 fixed spaces
            
            for(int j=0;j<2*(n-i-1)+1;j++)
                System.out.print("*");
            System.out.print("  ");//2 fixed spaces
            
            //i spaces
            for(int j=0;j<i;j++)
                System.out.print(" ");
            
            for(int j=0;j<n;j++)
                System.out.print("*");
            System.out.println();
            i++;
        }
        
    }
}