package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;



public class harmonic
{
	public static double getHarmonicNumber(int num) {
		double harmonicNumber = 1;
		for (double i = 2; i <= num; i++) {
			harmonicNumber = harmonicNumber + 1 / i;
		}
		return harmonicNumber;
	}

	public static void main(String[] args) {

		functionalutility ut = new functionalutility();
		System.out.println("Enter Harmonic Number");
		int num=functionalutility.inputInteger() ;
		System.out.println(getHarmonicNumber(num));

	}

	}




