import java.io.*;
import java.util.*;

public class rajanKnight {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int k=s.nextInt();
        int chess[][]=new int [r][c];
        printknightconfig(chess,0,k,-1);
        // System.out.println("end");
    }
    
    public static void printknightconfig(int chess[][],int psf,int tk,int idx)
    {
        if(psf==tk)
        {
            displayboard(chess);
            System.out.println();
        }
        
        // System.out.println(row+":"+col);
        // if(col==chess[0].length)
        // {
        //     row++;
        //     col=0;
        // }
        // System.out.println(row+":"+col+"\n");
        
        for(int i=idx+1;i<chess.length*chess[0].length;i++)
        {
            int row=i/chess.length;
            int col=i%chess[0].length;
            if(issafe(chess,row,col)==true)
            {
                // System.out.println(row+":"+col);
                chess[row][col]=1;
                // displayboard(chess);
                printknightconfig(chess,psf+1,tk,i);
                chess[row][col]=0;
            }
        }
    }
    static int[][] co={
        {-2,1},
        {-1,2},
        {1,2},
        {2,1},
        {2,-1},
        {1,-2},
        {-1,-2},
        {-2,-1}
    };
    public static boolean issafe(int chess[][],int row,int col)
    {
        for(int i=0;i<co.length;i++)
        {
            int r=row+co[i][0];
            int c=col+co[i][1];
            
            if(r>=0&&r<chess.length&&c>=0&&c<chess[0].length)
                if(chess[r][c]==1)
                    return false;
        }
        return true;
    }
    
    
    public static void displayboard(int chess[][])
    {
        for(int i=0;i<chess.length;i++)
        {
            for(int j=0;j<chess[0].length;j++)
            {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
}