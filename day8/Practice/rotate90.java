import java.util.Scanner;

public class rotate90{
    public static void transpose(int[][] arr){
        //transpose it wothout taking a new_array.
        //Use temp variable to store the value.
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        int n = arr.length;
        for(int i=0; i<n; i++){
            //reverse each row as a single 1D array after transposing.
            reverse(arr[i]);
        }
    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        //we do not need to return anything here.
        // as the changes are made into the arr itself which is passed into it 
        //and it is accessing its memory.
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //input of matrix
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        transpose(mat);
        //display matrix after 90 degree rotation
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}