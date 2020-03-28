import java.util.Scanner;

public class shellRotateJava{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        shellRotate(mat,s,r);
        display(mat);
    }

    public static void shellRotate(int[][] mat, int s, int r){
        //extract 1D array
        int[] arr = extract(mat,s);
        //rotate the array
        rotate(arr,r);
        //insert the elements into 2D array
        insert(arr,mat,s);
    }

    public static int[] extract(int[][] mat, int s){
        int row_size = mat.length;
        int col_size = mat[0].length;
        int row_min = s-1;
        int col_min = s-1;
        int row_max = row_size-s;
        int col_max = col_size-s;
        //formula for size of array
        int arrSize = 2*((col_max-col_min)+(row_max-row_min));
        int[] arr = new int[arrSize];
        //It is important to initialize idx = 0.
        int idx = 0;
        for(int i=row_min; i<=row_max; i++){
            arr[idx] = mat[i][col_min];
            idx++;
        }
        col_min++;
        for(int j=col_min; j<=col_max; j++){
            arr[idx] = mat[row_max][j];
            idx++;
        }
        row_max--;
        for(int i=row_max; i>=row_min; i--){
            arr[idx] = mat[i][col_max];
            idx++;
        }
        col_max--;
        for(int j=col_max; j>=col_min; j--){
            arr[idx] = mat[row_min][j];
            idx++;
        }
        return arr;
    }

    public static void rotate(int[] arr, int k){
        k = k% arr.length;
        if(k<0){
            k+=arr.length;
        }
        reverse(arr,0,arr.length-1-k);
        reverse(arr,arr.length-k, arr.length-1);
        reverse(arr,0, arr.length-1);
    }

    public static void reverse(int[] arr, int st, int end){
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void insert(int[] arr, int[][] mat, int s){
        int row_size = mat.length;
        //for size of column
        int col_size = mat[0].length;
        int row_min = s-1;
        int col_min = s-1;
        int row_max = row_size-s;
        int col_max = col_size-s;
        int idx = 1;
        for(int i=row_min; i<=row_max; i++){
            mat[i][col_min] = arr[idx];
            idx++;
        }
        col_min++;
        for(int j=col_min; j<=col_max; j++){
            mat[row_max][j] = arr[idx];
            idx++;
        }
        row_max--;
        for(int i=row_max; i>=row_min; i--){
            mat[i][col_max] = arr[idx];
            idx++;
        }
        col_max--;
        for(int j=col_max; j>=col_min; j--){
            mat[row_min][j] = arr[idx];
            idx++;
        }
    }

    public static void display(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}