import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        System.out.println(countways(n,m));
        System.out.println(getways(n,m));
        printways(n,m,"");
    }
    public static int countways(int n,int m){
        if(n==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=m;i++){
            if(n-i>=0){
              count=count+countways(n-i,m);
            }
        }
        return count;
    }
    public static ArrayList<String> getways(int n,int m){
          if(n==0){
            ArrayList<String> list=new ArrayList();
            list.add("");
            return list;
        }
        ArrayList<String> result=new ArrayList();
        for(int i=1;i<=m;i++){
            if(n-i>=0){
                //list.add(asf);
               
          ArrayList<String> list=getways(n-i,m);
                 for(String val:list){
                     result.add(String.valueOf(i)+val);
                 }                 
            }
        }
        return result;
    }
    public static void printways(int n,int m,String asf){
        if(n==0){
            System.out.println(asf);
            return;
        }
       
        for(int i=1;i<=m;i++){
            if(n-i>=0){
              printways(n-i,m,asf+i);
            }
        }
       
    }
    
}