package com.bridgeit.functionalprograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class array2d {
	static Scanner sc = new Scanner(System.in);

	public static int[][] arrayInt(int m, int n) {
		int[][] arr = new int[m][n];
		System.out.println("enter Integer Array ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
		public static String[][] arrayboolean(int m, int n) {
			String[][] arr1 = new String[m][n];
			System.out.println("enter boolean Array ");
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arr1[i][j] = sc.nextLine();
				}
			}
			return arr1;
		}
			public static double[][] arraydouble(int m, int n) {
				double[][] arr2 = new double[m][n];
				System.out.println("enter double Array ");
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						arr2[i][j] = sc.nextDouble();
					}
				}
				return arr2;
			}
				public static void displayInteger(int[][] arr, int m, int n) {
					PrintWriter pw = new PrintWriter(System.out, true);

					System.out.println();
					pw.println("2D ARRAY INTEGER");

					for (int i = 0; i < m; i++) {
						for (int j = 0; j < n; j++) {
							pw.print("\t" + arr[i][j] + " ");
						}
						pw.println("\t");
					}

				}
				public static void displayBoolean(String[][] arr1, int m, int n) {
					PrintWriter pw = new PrintWriter(System.out, true);
					System.out.println();
					pw.println("ARRAY BOOLEAN");

					for (int i = 0; i < m; i++) {
						for (int j = 0; j < n; j++) {
							pw.print("\t" + arr1[i][j] + " ");
						}
						pw.println("\t");
					}

				}

			

				public static void displayDouble(double[][] arr2, int m, int n) {
					PrintWriter pw = new PrintWriter(System.out, true);
					System.out.println();
					pw.println("ARRAY DOUBLE");

					for (int i = 0; i < m; i++) {
						for (int j = 0; j < n; j++) {
							pw.print("\t" + arr2[i][j] + " ");
						}
						pw.println("\t");
					}

				}

				
		

	public static void main(String[] args) {
		
		System.out.println("enter the number of rows");
		int m = sc.nextInt();
	
		System.out.println("enter the number of columns");
		int n = sc.nextInt();
		
		
		System.out.println("enter the number of choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			int[][] arr = array2d.arrayInt(m, n);
			displayInteger(arr, m, n);
			break;
		case 2:
			String[][] arr1 = array2d.arrayboolean(m, n);
			displayBoolean(arr1, m, n);

			break;
			
		case 3:
			double[][] arr2 = array2d.arraydouble(m, n);
			displayDouble(arr2, m, n);
			break;
			
		default:
			System.out.println("Wrong Input!!");
			break;
		}

	}

	}


