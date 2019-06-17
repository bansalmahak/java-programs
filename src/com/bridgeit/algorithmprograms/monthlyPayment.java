package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;


public class monthlyPayment {

	public static void main(String[] args) {
		
       double p= Integer.parseInt(args[0]);

       double y= Integer.parseInt(args[1]);

       double R= Integer.parseInt(args[2]);
       double num=algorithmutility.monthlypayment(p, y, R);
       System.out.println(num);
       


	}

}
