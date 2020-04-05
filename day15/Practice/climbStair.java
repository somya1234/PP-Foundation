
public class climbStair {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cb = climbStairPath(n,new int[n+1]);
        System.out.println(cb);
    }
    public static int climbStairPath(int n, int[] dp){
        if(n==0){
            return 1;
        }
        int countPath = 0;
        if(dp[n]!=0){
            return dp[n];
        }
        for(int step=1; step<=3; step++){
            if(n-step>=0){
                countPath += climbStairPath(n-step, dp);
                dp[n] = countPath;
                return dp[n];
            }
        }
        return countPath;
    }
}