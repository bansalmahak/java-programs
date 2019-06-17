package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;



class MergeSort 
{ 
    public static void main(String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
		int count;
		System.out.println("Enter the size of array: ");
		count=sc.nextInt();
		String array[]=new String[count];
		System.out.println("Enter all "+count+" elements of the array:");
		for(int c=0;c<count;c++) {
			array[c]=sc.next();
		}
        System.out.println("Given Array"); 
        algorithmutility.printArray(array); 
  
        
        algorithmutility.sort(array, 0, array.length-1); 
  
        System.out.println("Sorted array"); 
        algorithmutility.printArray(array); 
    } 
} 