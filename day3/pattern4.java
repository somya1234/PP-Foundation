import java.util.Scanner;

public class pattern4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                //error 1:- placing of brackets at right position.
                if(i==1 && ((j>=1 && j<=n/2+1) || j==n)){
                    System.out.print("*\t");
                } else if(i<=n/2 && (j==n/2+1 || j==n)){
                    System.out.print("*\t");
                } else if(i==n/2+1){
                    System.out.print("*\t");
                    //error 2:- i>=n/2+1 is important to write here because 
                    // in second condition it is false for i>=n/2 +1 and j==1
                    //and it is true for the same here.
                    // so it prints a * at i=2 and j=1 which is not required.
                } else if(i>=n/2+1 && i<n && (j==1 || j==n/2+1)){
                    System.out.print("*\t");
                } else if(i==n && (j==1 || (j>=n/2+1 && j<=n))){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}