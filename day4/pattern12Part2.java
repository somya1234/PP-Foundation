import java.util.Scanner;

public class pattern12Part2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
       
        //     // write ur code here
            int n = scn.nextInt();
            int st = 1;
            for(int i=1; i<=n; i++){
                // for(int j =1; j<=n; j++){
                    for(int j=1; j<=n; j++){
                        int val = 1;
                    if(i==n/2+1){
                        System.out.print("*\t");
                    } else if(j>=n/2+1){
                        if(i<=n/2){
                            System.out.print(val+"\t");
                            val++;
                        } else {
                            System.out.print(val+"\t");
                            val--;
                        }
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
    }
}