package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;

public class toss {
	public static void main (String[]arg) {
		functionalutility ut = new functionalutility();
		System.out.println("enter the number of coins to flip coin :" );
		int value= functionalutility.inputInteger();
		double heads=0;
		double tails=0;
		for (int i=1;i<value;i++) {
			if(Math.random()>0.5) {
				System.out.println("heads won");
				heads++;}
				else {
					System.out.println("tails won");
				tails++;
				}
			}
		System.out.println("the percentage of tails won"+tails/value*100);
		System.out.println("the percentage of heads won"+heads/value*100);
		}
		
	}


