package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;

public class leap {
	
public static void main(String[] args) {
		
	functionalutility ut =new functionalutility();
		System.out.println("enter the year:");
		int year = functionalutility.inputInteger();
	 
	   while (year < 999 || year > 9999) {
			System.out.println("Wrong Input !! Ensure that the year is in 4 Digit Number");
			System.out.println("Enter the year : ");
			year = functionalutility.inputInteger();
			 

		}

		if (((year % 4 == 0) || (year % 100 == 0)) || (year % 400 == 0)) {
			System.out.println(year + "  is a leap year ");
		} else {
			System.out.println(year + "  is not a leap year");
		}
	}
}


	   
   
          
	  
 
