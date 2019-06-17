package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;


public class insertionsort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int count;

        System.out.println("enter size of array : ");
        count=s.nextInt();
    
        String arr[]=new String[count];
        System.out.println("enter " + count + " integer");
        for(int c=0;c<count;c++) {
        	arr[c]=s.next();
	}
        algorithmutility.insertionsort(arr,count);
      System.out.println("insertion array : ");
      algorithmutility.printStringarray(arr);
	}
	
}
