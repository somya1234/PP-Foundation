package Test;

import java.util.Scanner;

public class madAngles {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = n+2;
        int second = 1;
    
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*\t");
            }
            System.out.print("\t");
            for(int j=0; j<first; j++){
                System.out.print("*\t");
            }
            System.out.print("\t");
            for(int j=0; j<second; j++){
                System.out.print("*\t");
            }
            System.out.print("\t");
            for(int j=0; j<first; j++){
                System.out.print("*\t");
            }
            System.out.print("\t");
            for(int j=0; j<n; j++){
                System.out.print("*\t");
            }
            first-=2;
            second+=2;
            System.out.println();
        }
    }
}