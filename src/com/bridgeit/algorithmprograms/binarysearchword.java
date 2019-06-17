package com.bridgeit.algorithmprograms;


import java.util.Arrays;
import java.util.Scanner;

public class binarysearchword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("enter the number of words you want to sort");
		int n = sc.nextInt();
		String[] words = new String[n]; 
		System.out.println("enter the word");
		for( i=0;i<words.length;i++) {
			System.out.println("word"+(i+1)+" : ");
			words[i]=sc.next();
		}
		System.out.println("enetr the word you want to search");
		String word = sc.next();  
		
		Arrays.sort(words);
				
		
	int index=Arrays.binarySearch(words, word);
	System.out.println("location of "+ word + " into the array at the index "+ index);
		
	}

}
