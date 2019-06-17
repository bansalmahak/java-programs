package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;



public class prime {

	public static void main(String[] args) {
		functionalutility ut = new functionalutility();
		System.out.println("enter the number:");
		int num = functionalutility.inputInteger();
		
		for (int i=2; i<num ;i++)
		{
			while(num%i==0) {
				System.out.println(i);
				num=num/i;
			}
			
			}
			if(num>2) {
				System.out.println(num);
		}
		
		
	}

}
