package day15;

import java.util.Scanner;

public class phoneBooth {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    int flow = 0;
    while(flow<arr.length){
        if(arr[flow]==0){
            flow+=2;
            k--;
            arr[flow] = 1;
        } else {
            flow+=1;
        }
    }
    if(k==0){
        System.out.println(true);
    }
    else {
        System.out.println(false);
    }
}