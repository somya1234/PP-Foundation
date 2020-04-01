import java.util.Scanner;

public class printMazePath{
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
        printAllMazePaths(rs,cs+1,re,ce,path+"h");
        printAllMazePaths(rs+1,cs,re,ce,path+"v");
    }
}