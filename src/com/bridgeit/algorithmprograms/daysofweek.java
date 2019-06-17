package com.bridgeit.algorithmprograms;
import com.bridgeit.util.algorithmutility;

public class daysofweek {

	public static void main(String[] args) {
		int d = Integer.parseInt(args[0]);
		int m= Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int days = algorithmutility.daysofweek(d, m, y);
		System.out.println(days);
		
	}

}
