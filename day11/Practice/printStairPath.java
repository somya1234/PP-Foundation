import java.util.Scanner;

public class printStairPath{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPaths(n, "");
    }
    public static void printPaths(int que, String ans){
        if(que==0){
            System.out.println(ans);
        }
        if(que<0){
            return;
        }
        printPaths(que-1, ans+1);
        printPaths(que-2, ans+2);
        printPaths(que-3, ans+3);
    }
}