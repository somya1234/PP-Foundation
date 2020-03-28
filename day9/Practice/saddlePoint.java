import java.util.Scanner;

public class saddlePoint{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        //to check the saddle point
        Boolean checkFlag = true;
        for(int i=0; i<n; i++){
            int minEle = mat[i][0];
            int minIndex = 0;
            for(int j=1; j<n; j++){
                if(mat[i][j]<minEle){
                    minEle = mat[i][j];
                    minIndex = j;
                }
            }
            //to check whether this element is maximum in its column
            Boolean flag = true;
            for(int k=0; k<n; k++){
                if(mat[k][minIndex]>minEle){
                    flag = false;
                    break;
                }
            }
            if(flag){
                //note:-> toggle checkFlag here, if the saddle point id found, otherwise print "Not Found"
                checkFlag = false;
                System.out.println(minEle);
            }
        }
        if(checkFlag){
            System.out.println("Invalid input");
        }
    }
}