import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            wt[i] = scn.nextInt();
        }
        int tar = scn.nextInt();

        maxwt(wt, val, tar,0,0);
        System.out.println(max);
	    }
	    
	    static int max = Integer.MIN_VALUE;
	    
	    public static void maxwt(int[] wt, int[] val, int tar,int cval,int idx){
	        if(tar<0)
	        {
	            return;
	        }
	        if(tar>=0)
	        {
	            if(cval>max)
	            {
	                max=cval;
	            }
	        }
	 for(int i=idx;i<wt.length;i++)
	 {
	     maxwt(wt,val,tar-wt[i],cval+val[i],i);
	 }
	        
	    }
	}