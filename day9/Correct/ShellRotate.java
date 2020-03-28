import java.io.*;
import java.util.*;

public class ShellRotate {
    //k--> no of time to be roatted
    //shellNo - which shell to be rotated
    public static void shellRotate(int[][] mat, int shellNo, int k){
        //extract the elements
        int[] arr = fill1D(mat, shellNo);
        //rotate 1D Array
        rotate(arr, k);
        //insert the elements back to the matrix or fill up the 2D array. 
        fill2D(mat,shellNo,arr);
    }

    public static int[] fill1D(int[][] mat, int shellNo){
        //extract
        int row_size = mat.length;
        int col_size = mat[0].length;
        int s = shellNo;
        //setting the values after generalizing
        int row_min = s-1;
        int row_max = row_size - s;
        int col_min = s-1;
        int col_max = mat[0].length-s;
        //formula can also be -
        //totalLen = 2*((max_col-min_col)+(max_row-min_row))
        //or can be done by this method.

        //calculate the length and breadth to calculate total no of elements
        int shellLen = row_size - 2*(shellNo-1);
        int shellCol = col_size - 2*(shellNo-1);
        //for a rectangle --> total no of elements = 2*(l+b);
        //to remove the extra 4 elements on the corners of the boundary due to repetition
        //4 is subtracted from the total length.
        int totalLen = 2*(shellLen + shellCol)-4;

        int[] arr = new int[totalLen];
        int idx = 0;
        for(int i=row_min; i<=row_max; i++){
        //note:- don't forget to write 'i' in mat[i][col_min]
        //don't write row_min. It's just used for initialization.(Error)
            arr[idx] = mat[i][col_min];
            idx++;
        }
        col_min+=1;
        for(int j=col_min; j<=col_max; j++){
            arr[idx] = mat[row_max][j];
            idx++;
        }
        row_max--;
        for(int i=row_max; i>=row_min; i--){
            arr[idx] = mat[i][col_max];
            idx++;
        }
        col_max--;;
        for(int j=col_max; j>=col_min; j--){
            arr[idx] = mat[row_min][j];
            idx++;
        }
        return arr;
        
    }

    public static void rotate(int[] arr, int k){
        //absolute value
        k = k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        //rotate
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse (int arr[], int left, int right){
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void fill2D(int[][] mat, int shellNo, int rotatedArr[]){
        //initialize the array properly(Error.)
        int[] arr = rotatedArr;
        int row_size = mat.length;
        int col_size = mat[0].length;
        int s = shellNo;

        int row_min = s-1;
        int row_max = row_size-s;
        int col_min = s-1;
        int col_max = col_size-s;
        int idx = 0;
        for(int i=row_min; i<=row_max; i++){
            // arr[idx] = mat[row_min][col_min];
            mat[i][col_min] = arr[idx];
            idx++;
        }
        //do increment this to avoid dupliacte values.
        col_min+=1;
        for(int j=col_min; j<=col_max; j++){
            mat[row_max][j] = arr[idx];
            idx++;
        }
        row_max--;
        for(int i=row_max; i>=row_min; i--){
            mat[i][col_max] = arr[idx];
            idx++;
        }
        col_max--;;
        for(int j=col_max; j>=col_min; j--){
            mat[row_min][j] = arr[idx];
            idx++;
        }        
    }
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int shellNo = scn.nextInt();
        int k = scn.nextInt();
        shellRotate(mat,shellNo,k);
        display(mat);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        

    }

}