import java.util.*;
      
      public class SandClock2{
      
      public static void main(String[] args) {
          Scanner scn = new Scanner(System.in);
      
           // write ur code here
            int n = scn.nextInt();
            int high = n;
            int spaces = 0;
            for(int i=1; i<=n; i++){
                for(int j=1; j<=spaces; j++){
                    System.out.print("\t");
                }
                //for printing stars
                for(int j=1; j<=high; j++){
                    if(i>n/2){
                        System.out.print("*\t");
                    } else {
                        if(i==1){
                            System.out.print("*\t");
                            // after spaces stars will be print at end position
                            // and first position.
                        } else if(j==1 || j==high){
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }
                }
               
                if(i<=n/2){
                    high-=2;
                    spaces++;
                } else {
                    high+=2;
                    spaces--;
                }
                System.out.println();
            }
       }
      }