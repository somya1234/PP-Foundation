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
        Boolean newFlag = true;
        //traverse each new row(i.e. downwards)
        for(int row=0; row<n; row++){
            //find minimum Element in each row
            //as these variables are used later for finding max of column, create it outside the 
            //mext for loop.
            int minEle = mat[row][0];
            int minIndex = 0;
            //finding minimum element in each row.
            for(int col=0; col<n; col++){
                if(mat[row][col]<minEle){
                    minEle = mat[row][col];
                    minIndex = col;
                }
            }
            Boolean flag = true;
            //finding maximum in a column
            for(int k=0; k<n; k++){
                // another element is greater in the column than the element which is minimum in the row
                //for an element ot be saddle
                //it should be minimum in the row and largest element in the column
                if(mat[k][minIndex]>minEle){
                    flag = false;
                    break;
                    //break if it isn't saddle element.
                    //check for new row.
                }
            }
            //it will be printed only once as any 2D array have only one saddle point
            //after it has been achieved or got, call break statement.
            if(flag){
                System.out.println(minEle);
                newFlag = false;
                break;
            }
        }
        if(newFlag){
            System.out.println("Invalid input");
        }
    }
}