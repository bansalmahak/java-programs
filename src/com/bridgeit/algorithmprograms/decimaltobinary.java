package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;

public class decimaltobinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal number : ");
		int num= sc.nextInt();
		
		
		System.out.println("binary number : " + algorithmutility.toBinary(num));
	}
	

}
