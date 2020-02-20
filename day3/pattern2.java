import java.util.Scanner;

public class pattern2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            System.out.println();
            st--;
        }
    }
}