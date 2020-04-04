package day14.Practice

import java.util.Scanner;

Recursion;

public class printMazePath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
        System.out.println();
    }
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path){
        if(sr==dr && sc==dc){
            System.out.println(path);
        }
        if(sr==dr+1 || sc==dc+1){
            return;
        }
        printMazePaths(sr, sc+1, dr, dc, path+"h");
        printMazePaths(sr+1, sc, dr, dc, path+"v");
        return;
    }
}