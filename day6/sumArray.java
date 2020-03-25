import java.util.Scanner;

//It can be done by converting it into numbers also but there would be a size limit in 
//integers. Integers can only store upto 32 .
//But we can have numbers upto 100 in any array.

//Don't do this by using this method.
// do this by sumOfTwoArray.java by adding two arrays.

public class sumArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        String str1 = "";
        for(int i=0; i<arr1.length; i++){
            str1+=arr1[i];
        }
        int num1 = Integer.parseInt(str1);
        String str2 = "";
        for(int i=0; i<arr2.length; i++){
            str2+=arr2[i];
        }
        int num2 = Integer.parseInt(str2);
        System.out.println(num1);
        System.out.println(num2);

        int carry = 0;
        int p =1;
        int rv = 0;
        while(num1>0 || num2>0 || carry>0){
            int rem1 = num1%10;
            int rem2 = num2%10;
            int sum = rem1+rem2+carry;
            carry = sum/10;
            sum = sum%10;
            rv+=sum*p;
            p*=10;
            num1/=10;
            num2/=10;
        }
        System.out.println(rv);
    }
}