package com.bridgeit.functionalprograms;

public class windchill {

	public static void main(String[] args) {
		double t= Double.parseDouble(args[0]);
		double v= Double.parseDouble(args[1]);
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println("temperature = " +t);
		System.out.println("windspeed  = " +v);
		System.out.println("windchill = " +w);

	}

}
