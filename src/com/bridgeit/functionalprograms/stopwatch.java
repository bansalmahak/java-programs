package com.bridgeit.functionalprograms;

import com.bridgeit.util.functionalutility;

public class stopwatch {
	static double start = 0, stop = 0;

	public static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("Start Time  :" + start);
	}

	public static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("Stop Time :" + stop);
	}

	public static void elapsedTime() {
		System.out.println("Elapsed Time is " + (stop - start) / 1000);
	}

	public static void main(String[] args) {
		
		functionalutility ut= new functionalutility();
		System.out.println("Enter  Number  To Start  :");
		functionalutility.inputInteger();
		startTime();
		System.out.println("Enter  Number To Stop");
		functionalutility.inputInteger();
		stopTime();
		elapsedTime();
	}
		
		
	}


