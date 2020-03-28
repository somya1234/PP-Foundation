import java.util.Scanner;

public class searchSortedArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        Boolean flag = true;
        int d = scn.nextInt();
        int i = 0;
        int j = arr.length-1;
        //1. This condition is used because j can never be >=arr.length.
        //It will always move to left.
        //So, we need to check if(j<0), then stop.

        //2, i (i.e row) can never go to top. because we are always incrementing i.
        //so we need to check i==n, then stop.
        //no need to check for i<0, because it will never move upwards.
        while(!(i==n || j<0)){
            if(arr[i][j]==d){
                System.out.println(i);
                System.out.println(j);
                flag = false;
                break;
            } else if(arr[i][j]>d){
                //if array element is greater than d, move one column backwards.
                j--;
            } else {
                // if the element is smaller than d, check in the current column for other values of row.
                i++;
            }
        }
        if(flag){
            System.out.println("Not Found");
        }
    }
}