package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;


public class swap {

	public static void main(String[] args) {
		
		String str = "heart";
		int n = str.length();
		functionalutility.permute(str, 0, n - 1);
		System.out.println("Number of Permutations " + functionalutility.count);
	}

}
