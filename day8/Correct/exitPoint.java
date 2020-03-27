public class exitPoint{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        //0--> east direction --> row same, col changes
        //1-->south direction --> row changes, col same
        //2-->west direction -> row same, col changes
        //4-->north direction
        int dir = 0;
        int row=0, col=0;
        while(true){
            dir= (dir+arr[row][col])%4;
            if(dir == 0){
                col++;
            } else if(dir == 1){
                row++;
            } else if(dir == 2){
                col--;
            } else if(dir == 3){
                row--;
            }

            //exit point calculations
            if(col == m){
                //right wall or east
                col--;
                break;
            } else if(row == n){
                //bottom wall or south
                row--;
                break;
            } else if(col == -1){
                //left wall or from west
                col++;
                break;
            } else if(row == -1){
                //north or top wall
                row++;
                break;
            }
        }
    }
}