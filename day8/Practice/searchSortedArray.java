import java.util.Scanner;

public class Demo{
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
        while(!(i<0 || j==n)){
            if(arr[i][j]==d){
                System.out.println(i);
                System.out.println(j);
                flag = false;
                break;
            } else if(arr[i][j]>d){
                j--;
            } else {
                i++;
            }
        }
        if(flag){
            System.out.println("Not Found");
        }
    }
}