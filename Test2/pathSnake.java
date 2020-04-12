import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int count = countSnake(n, m, n);
        System.out.println(count);
        ArrayList<String> ans = getPaths(n, m, n);
        System.out.println(ans);
        printPaths(n, m, n, "");
    }

    public static int countSnake(int n, int m, int new_m) {
        int count = 0;
        if (n == 0) {
            count += 1;
            return count;
        }
        if (n < 0) {
            return 0;
        }
        if (m < n) {
            for (int idx = 1; idx <= m; idx++) {
                count += countSnake(n - idx, m, new_m);
            }
        } else {
            for (int idx = 1; idx <= new_m; idx++) {
                count += countSnake(n - idx, m, new_m);
            }
        }

        return count;
    }

    public static ArrayList<String> getPaths(int n, int m, int new_m) {
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (n < 0) {
            ArrayList<String> invalid = new ArrayList<>();
            return invalid;
        }
        ArrayList<String> result = new ArrayList<>();

        // List<List<String>> generalList = new ArrayList<>();
        ArrayList<String> myGroup;
        if (m < n) {
            for (int i = 1; i <= m; i++) {
                // ArrayList<String> myGroup = new ArrayList<>();
                myGroup = getPaths(n - i, m, new_m);
                for (String val : myGroup) {
                    result.add(n - i + val);
                }
            }
        } else {
            for (int i = 1; i <= new_m; i++) {
                myGroup = getPaths(n - i, m, new_m);
                for (String val : myGroup) {
                    result.add(i + val);
                }
            }
        }
        return result;
    }

    public static void printPaths(int n, int m , int new_m, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(n<0){
            return;
        }
        if (m < n) {
            for (int idx = 1; idx <= m; idx++) {
                printPaths(n - idx, m, new_m, ans+idx);
            }
        } else {
            for (int idx = 1; idx <= new_m; idx++) {
                printPaths(n - idx, m, new_m, ans+idx);
            }
        }
        return;
    }
}