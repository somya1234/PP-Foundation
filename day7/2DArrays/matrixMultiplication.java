import java.io.*;
import java.util.*;

//Dry Run the code if you have any confusion.

public class matrixMultiplication{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int m1 = scn.nextInt();
    int n1 = scn.nextInt();
    int[][] mat1 = new int[m1][n1];
    for(int i=0; i<m1; i++){
        for(int j=0; j<n1; j++){
            mat1[i][j] = scn.nextInt();
        }
    }
    int m2 = scn.nextInt();
    int n2 = scn.nextInt();
    int[][] mat2 = new int[m2][n2];
    for(int i=0; i<m2; i++){
        for(int j=0; j<n2; j++){
            mat2[i][j] = scn.nextInt();
        }
    }
    if(n1==m2){
        int[][] mat3 = new int[m1][n2];
        //the new matrix will be of [m1*n2]
        //so i till m1 , handles all the rows.
        for(int i=0; i<m1; i++){
            //j handles all the columns of the new formed matrix.
            for(int j=0; j<n2; j++){
                //not necessary to initialize it to 0.
                mat3[i][j] = 0;
                //k controls the number of time the two matrixes will multiply for one element .
                //k<n1 as well as k<m2, both are true.

                for(int k=0; k<n1; k++){
                    mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);  
                    }
            }
        }
       for(int i=0; i<m1; i++){
        for(int j=0; j<n2; j++){
            System.out.print(mat3[i][j]+" ");
        }
        System.out.println();
    } 
    } else {
        System.out.println("Invalid input");
    }
    }
}