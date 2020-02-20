import java.util.Scanner;

public class pattern5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
               
                    // write ur code here
                    int n = scn.nextInt();
                    int st = 1;
                    int sp = n/2;
                    for(int i=1; i<=n; i++){
                        for(int j=1; j<=sp; j++){
                            System.out.print("\t");
                        }
                        for(int j=1; j<=st; j++){
                            System.out.print("*\t");
                        }
                        if(i<=n/2){
                            sp--;
                            st+=2;
                    } else {
                        sp++;
                        st-=2;
                    }
                    System.out.println();
                    }
    }
}