import java.io.*;
import java.util.*;

public class circleManiac {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int x1=scn.nextInt();
        int y1=scn.nextInt();
        int x2=scn.nextInt();
        int y2=scn.nextInt();
        int r1=scn.nextInt();
        int r2=scn.nextInt();
        
        
        if(x1==x2&&y1==y2)
        {
            System.out.println("concentric");
            return;
        }
        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        // System.out.println(distance);
        if(distance>r1+r2)
        {
            System.out.println("far-apart");
            return;
        }
        if(distance==r1+r2)
        {
            System.out.println("touches at 1 point");
            return;
        }
        if(distance<r1+r2)
        {
            if(distance+r1<=r2||distance+r2<=r1)
            {
                System.out.println("overlaps");
                return;
            }
            System.out.println("touches at 2 point");
            return;
        }
    }
}