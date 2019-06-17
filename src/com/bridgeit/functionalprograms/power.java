package com.bridgeit.functionalprograms;

public class power {
	public static void getPrintTable(int num) {
		int num1 = 1;
		for (int i = 0; i < num; i++) {
			num1 = num1 * 2;
			System.out.println(num1);
		}

	}

	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		while (num < 0 || num > 31) {
			System.out.println("Wrong Input");
			}
		getPrintTable(num);

	}
	}