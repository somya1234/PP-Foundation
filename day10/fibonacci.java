public class fibonacci{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibNum1 = fib(n-1);
        int fibNum2 = fib(n-2);
        int fibN = fibNum1 + fibNum2;
        return fibN;
    }
}