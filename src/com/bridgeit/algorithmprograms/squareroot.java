package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;




public class squareroot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		System.out.println("the squareroot is :"+ algorithmutility.squareroot(num));
		
	}

}
