import java.util.Scanner;

public class recursive{
    public static void printInc(int n){
        //faith of printing 1-4 numbers first
        //put faith in a function
        if(n==0){
            //it will return from a recursive call of a function.
            return;
        }
        printInc(n-1);
        //then print 5 (work)
        System.out.println(n);
    }
    public static void printDec(int n){
        //first work (to print 5)
        if(n==0){
            return;
        }
        System.out.println(n);
        //faith (it will print 4 3 2 1)
        printDec(n-1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    }
}