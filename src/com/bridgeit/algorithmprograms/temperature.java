package com.bridgeit.algorithmprograms;


import java.util.Scanner;

import com.bridgeit.util.algorithmutility;



public class temperature {
	

	
		public static void main(String[] args) {
			try {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the input in c and f");
			int tem = sc.nextInt();
			char t=sc.next().charAt(0);
			sc.close();
			if( t!='c'  &&  t!='C' &&  t!='f'  && t!='F') {
				System.out.println("enter correct input");
	        main(args);
			return;
			}
			tem =algorithmutility.temperatureconversion(tem, t);
			System.out.println("coverted temp is " + tem);
		} catch (Exception e) {
			System.out.println("temperature in format 4545 c");
		}




		}

}

