package Test;

import java.util.Scanner;


public class madAngles2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 2*n-1;
        int second = 1;
        int first_space = 0;
        int second_space = n-1;
    
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.print("  ");
            //first block
            for(int j=0; j<first_space; j++){
                System.out.print(" ");
            }
            for(int j=0; j<first; j++){
                System.out.print("*");
            }
            
            System.out.print("  ");
            //second block
            
            for(int j=0; j<second; j++){
                System.out.print("*");
            }
          
            System.out.print("  ");
            //third block
            
            for(int j=0; j<first; j++){
                System.out.print("*");
            }
            for(int j=0; j<first_space; j++){
                System.out.print(" ");
            }
            System.out.print("  ");
            //last block
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            first-=2;
            first_space+=1;
            second+=2;
            second_space-=1;
            System.out.println();
        }
    }
}