package com.bridgeit.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class functionalutility {
	static BufferedReader br;
	public static int count=0;

	// CREATING CONSTRUCTOR WITH SAME NAME AS CLASS
	public functionalutility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	// INPUT STRING
	public static String inputString() {
		try {
			return br.readLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT INTEGER
	public static int inputInteger() {
		try {
			return Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT DOUBLE
	public double inputDouble() {
		try {
			return Double.parseDouble(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	// INPUT BOOLEAN
	public boolean inputBoolean() {
		try {
			return Boolean.parseBoolean(br.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// REMOVING BLANK SPACES
	public String remove_spaces(String str) {
		try {
			return str.replaceAll("\\s", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
		
	}
	
	public static void permute(String str, int l, int r) {
		
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				count++;
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}

	}

	private static String swap(String str, int start, int end) {
		
			char temp;
			char[] charArray = str.toCharArray();
			temp = charArray[end];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			return String.valueOf(charArray);
		
	}
	public static void printBoard(char[][] board) {
		for(int i=0;i<board.length;i++) {
			System.out.print("| ");
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" | ");
			}
			System.out.println("\n");
		}
		System.out.println();
	}
}