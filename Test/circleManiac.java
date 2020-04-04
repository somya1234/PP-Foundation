package day14.Practice Recursion;

public class circleManiac {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y1 = scn.nextInt();
        int y2 = scn.nextInt();
        int r1 = scn.nextInt();
        int r2 = scn.nextInt();
        if(r1==r2 && x1==x2 && y1==y2){
            System.out.print("concentric");
        } 
    }
}