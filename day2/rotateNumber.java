import java.util.Scanner;

public class rotateNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count = 0;
        // finding count
        //error 1:- you may not store the value of n in temp.
        //this can lead to the change of original value of n.
        int temp = n;
        while(temp>0){
            temp/=10;
            count++;
        }
        //finding true rotation
        k = k%count;
        //finding rotation of negative numbers
        if(k<0){
            k+=count;
        }
        // finding div and mul
        int div = 1; double mul =1;
        //error:- you may write n instead of count in the loop.
        for(int i=1; i<=count; i++){
            if(i<=k){
                div*=10;
            } else {
                mul*=10;
            }
        }
        System.out.println(mul);
        //get the quo and rem
        int quo = n/div;
        int rem = n%div;

        //make the final rotated number
        int number = (rem*mul)+quo;
        System.out.println(number);
    }
}