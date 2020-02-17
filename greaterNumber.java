import java.util.Scanner;

public class greaterNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        // method 1-
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }
        if(num2>num1 && num2>num3){
            System.out.println(num2);
        }
        if(num3>num1 && num3>num2){
            System.out.println(num3);
        }

        // method 2-
        if(num1>num2 && num1>num3){
            System.out.println(num1+"is largest");
        } else {
            if(num2>num1 && num2>num3){
              System.out.println(num2+ "is largest");
            } else{
            System.out.println(num3 + "is largest");
            }
        }
        

        // method 3
        if(num1>num2){
            if(num1>num3){
                System.out.println("num1");
            } else {
                System.out.println("num3");
            }
        } else{
            if(num2>num3){
                System.out.println(num2);
            } else{
                System.out.println(num3);
            }
        }
    }
}