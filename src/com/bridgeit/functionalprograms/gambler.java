package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;

public class gambler {

	public static void main(String[] args) {
		functionalutility ut = new functionalutility();
		int goals=200;
				System.out.println("Enter the stake");
				int stake = functionalutility.inputInteger();
				System.out.println("Enter the number of times you want to play");
			    int played = functionalutility.inputInteger();
				
				int win = 0;
				if(stake>goals) {
					System.out.println("Entered amount is above goal limit");
				}
				else {
				for (int i = 0; i < played; i++) {
					
					while (stake> 0 && stake < goals) {
						if (Math.random()> 0.5)
							System.out.println(stake++);
						else 							
							System.out.println(stake--);
					}
				}
						if (stake == goals) {
							win++;
						}
						System.out.println("Percent of Games Wins : " + win / played * 100);
						System.out.println("Percent of Games Loss : " + (played - win) / played * 100);
						System.out.println("Total Number of Games : " + 5);
					
	}
				
				
				

	}}
