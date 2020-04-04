package day14.Practice Recursion;

public class printMazeWithJumps {
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
        for(int step=1; sc+step<=dc; step++){
            printMazePaths(sr, sc+step, dr, dc, path+"h"+step);
        }
        for(int step=1; sr+step<=dr; step++){
            printMazePaths(sr+step, sc, dr, dc, path+"v"+step);
        }
        for(int step=1; sc+step<=dc && sr+step<=dr; step++){
            printMazePaths(sr+step, sc+step, dr, dc, path+"d"+step);
        }
        return;
    }
}