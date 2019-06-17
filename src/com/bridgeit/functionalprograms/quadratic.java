package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;



public class quadratic {
	public static void main(String[] args) {
		functionalutility ut = new functionalutility();
		System.out.println("enter the value of a:");
		int a=functionalutility.inputInteger();
		System.out.println("enter the value of b:");
		int b= functionalutility.inputInteger();
		System.out.println("enter the value of c:");
		int c= functionalutility.inputInteger();
		double root1,root2;
		double delta= b*b-4*a*c;
		if(delta>0) {
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("root1="+root1+  " root2="+root2);
		}
		else if(delta==0) {
			root1=root2=-b/(2*a);
			System.out.println("root1 = root2="+root1);
		}
		else {
			double realpart=-b/(2*a);
			double imaginarypart=Math.sqrt(-delta/(2*a));
			System.out.println("root1="+realpart+imaginarypart+ " root2="+realpart+imaginarypart);
		}
		
		
	}

}
