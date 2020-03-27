public class saddlePoint{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        //all was made in a function
        //calculating saddle point
        //minimum of it's row and miximum of it's column
        for(int row = 0; row<n; row++){
            //for finding minimum element and row index
            int minEle = arr[row][0];
            int minIndex = 0;

            for(int col = 1; col<n; col++){
                if(arr[row][col]<minEle){
                    minEle = arr[row][col];
                    minIndex = col;
                }
            }
            //check if it is max element in that col
            boolean flag = true;
            for(int k = 0; k<n; k++){
                //minC is fixed
                //traverse the row in that column to find the max in the col
                if(arr[k][minIndex] > arr[row][minIndex]){
                    flag = false;
                    //now arr[row][minIndex] is not the max eleement
                }
            }
            if(flag == true){
                System.out.println(arr[row][minIndex]);
                break;
            }
        }
        System.out.println("Invalid input");
    }
}