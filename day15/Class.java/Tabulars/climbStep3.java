import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = climbPaths(n);
        System.out.println(ans);
    }
    public static int climbPaths(int n){
        int db[] = new int[n+1];

        //simple position answer
        db[n] = 1;

        for(int stair= n-1; stair>=1; stair--){
            int countPaths = 0;
            for(int climb = 1; climb<=3; climb++){
                //if we can apply all steps to each element
                //for eg --> for 4 we can only apply climb = 1
                if(stair+climb<=n){
                    countPaths +=db[stair+climb];
                }
            }
            //resource building
            db[stair] = countPaths;
        }
        return db[0];
    }

}