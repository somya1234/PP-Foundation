import java.util.Scanner;

public class SandClock{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        int sp =0;
        int ist = 1;
        int isp = n/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            if(i>1 && i<=n/2){
                System.out.print("*\t");
                for(int j=1; j<=isp; j++){
                    System.out.print("\t");
                }
                System.out.print("*\t");
                isp-=2;
            } else {
                for(int j=1; j<=st; j++){
                    
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                sp++;
                st-=2;
                
            } else {
                sp--;
                st+=2;
            }
            System.out.println();
        }

    }
}