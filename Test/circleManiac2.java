import java.io.*; 
import java.util.*;
class circleManiac
{ 
    static int circle(int x1, int y1, int x2,  
                      int y2, int r1, int r2) 
    { 
        int distSq = (x1 - x2) * (x1 - x2) + 
                     (y1 - y2) * (y1 - y2); 
        int radSumSq = (r1 + r2) * (r1 + r2); 
        int anotherSum = (r1-r2) * (r1-r2);
        if (distSq == radSumSq) 
            return 1; 
        else if(distSq == anotherSum)
            return 1;
        else if (distSq > radSumSq) 
            return -1; 
        else if((r1 + r2 == r1 ) || (r1+r2 == r2)){
            return 2;
        }
        else
            return 0; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        Scanner scn = new Scanner(System.in);
        int x1 = scn.nextInt();
        int x2 = scn.nextInt();
        int y1 = scn.nextInt();
        int y2 = scn.nextInt();
        int r1 = scn.nextInt();
        int r2 = scn.nextInt();
        int t = circle(x1, y1, x2,  
                       y2, r1, r2); 
        if (t == 1) 
            System.out.println ("touches at 1 point"); 
        else if (t < 0) 
            System.out.println ( "far-apart"); 
        else if( t==2)
            System.out.println("touches at 2 point");
        else
            System.out.println ( "concentric"); 
              
    } 
} 