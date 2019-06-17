package com.bridgeit.algorithmprograms;


import java.util.Scanner;


public class vender {
	public static void countcurrency(int amount) {
		int[] notes = {1000,500,100,50,20,10,5,2,1};
		int[] notecounter=new int[9];
		for(int i=0;i<9;i++) {
			if(amount>=notes[i]) {
				notecounter[i]=amount/notes[i];
				amount=amount-notecounter[i]*notes[i];
			}
		}
		System.out.println("currency count");  
		for(int i=0;i<9;i++) {
			
			if(notecounter[i]!=0) {
				System.out.println(notes[i] + ":" + notecounter[i]);
			}
		}
			
		}
		public static void main(String[] args) {
		    Scanner sc= new Scanner(System.in);
			System.out.println("enter the amount : ");
			int amt=sc.nextInt();
			countcurrency(amt);
	}		
}


