import java.util.Scanner;

public class printMazePathWithJump{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        /*
        int rs --> starting row
        int cs --> column starting
        int re --> row end
        int ce --> eolumn end
        string path --> path
        */
        printAllMazePaths(0,0,n-1,m-1,"");
        // as there is a case in pepcoding editor which doesn't read empty output
        //it needs an enter or println statement .
        System.out.println();
    }
    public static void printAllMazePaths(int rs, int cs , int re, int ce , String path){
        if(rs==re && cs == ce){
            System.out.println(path);
        }
        if(rs == re+1 || cs == ce+1){
            return;
        }
        for(int step=1; cs+step<=ce; step++){
            printAllMazePaths(rs,cs+step,re,ce,path+"h"+step);
        }
        for(int step=1; rs+step<=re; step++){
            printAllMazePaths(rs+step,cs,re,ce,path+"v"+step);
        }
        for(int step=1;rs+step<=re && cs+step<=ce; step++){
            printAllMazePaths(rs+step,cs+step,re,ce,path+"d"+step);
        }
    }
}