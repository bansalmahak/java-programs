package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;


public class anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  first word : ");
		String Word1= sc.nextLine();
		
		System.out.println("enter the  second word : ");
		String Word2= sc.nextLine();
		 String w1;
		 String w2;
		 w1=Word1.toLowerCase();
		 w2=Word2.toLowerCase();
		algorithmutility ut = new algorithmutility();
			ut.process(w1,w2);
		}

}
