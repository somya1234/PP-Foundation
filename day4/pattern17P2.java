import java.util.Scanner;

public class pattern17P2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=-n/2; i<=n/2; i++){
            for(int j=-n/2; j<=n/2; j++){
                if(i==0){
                    System.out.print("*\t");
                } else if(j==0){
                    System.out.print("*\t");
                // draw * except middle lines.
                } else if(j>0 && Math.abs(i)+Math.abs(j)<n/2+1){
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}