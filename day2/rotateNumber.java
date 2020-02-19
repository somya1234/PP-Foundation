import java.util.Scanner;

public class rotateNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count = 0;
        // finding count
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
        int div = 1; int mul =1;
        for(int i=1; i<=count; i++){
            if(i<=k){
                div*=10;
            } else {
                mul*=10;
            }
        }
        //get the quo and rem
        int quo = n/div;
        int rem = n%div;

        //make the final rotated number
        int number = (rem*mul)+quo;
        System.out.println(number);
    }
}