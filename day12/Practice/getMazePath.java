package day12.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class getMazePath {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans = getMazePathFn(0,0,n-1,m-1);
        System.out.println(ans);
    }
    public static ArrayList<String> getMazePathFn(int sr, int sc, int dr, int dc){
        //sr--> source row
        //sc--> source column
        //dr-> destination row 
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr>dr || sc>dc){
            ArrayList<String> invalid = new ArrayList<>();
            return invalid;
        }
        ArrayList<String> horizontalRec = getMazePathFn(sr, sc+1, dr, dc);
        ArrayList<String> verticalRec = getMazePathFn(sr+1, sc, dr, dc);
        ArrayList<String> result = new ArrayList<>();

        for(String val:horizontalRec){
            result.add("h"+val);
        }
        for(String val:verticalRec){
            result.add("v"+val);
        }
        return result;
    }
}