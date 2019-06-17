package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;


public class replace {

	public static void main(String[] args) {
		String s1 = "hey ";
		String s2 = " how are you";
		functionalutility ut = new functionalutility();
		
		System.out.println("Enter your username:");
		String s3=functionalutility.inputString();
		System.out.println(s1+s3+s2);

	}

}
