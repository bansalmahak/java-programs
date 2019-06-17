package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;


public class bubblesort {
	public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int count;

        System.out.println("enter size of array");
        count=s.nextInt();
    
        int arr[]=new int[count];
        System.out.println("enter"+ count +"integer");
        for(int c=0;c<count;c++) {
        	arr[c]=s.nextInt();
        }
        
        
        
        algorithmutility.bubblesort(arr,count);
       System.out.println("sorted list of numbers");
       for(int c=0;c<count;c++) {
    	   System.out.println(arr[c]);
       }
		
	}

}
