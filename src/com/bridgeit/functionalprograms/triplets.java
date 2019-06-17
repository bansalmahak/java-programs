package com.bridgeit.functionalprograms;

public class triplets {
	public static void sumtriplets(int[]arr,int n) {
		boolean value= true;
		for(int i = 0; i<n-2;i++) {
			for (int j=0; j<n-1; j++ )
			{
				for(int k=0; k<n; k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
					System.out.println(arr[i]);
					System.out.println("");
					System.out.println(arr[j]);
					System.out.println("");
					System.out.println(arr[k]);
					System.out.println("\n");
					value=true;
					}
				}
			}
		}
		if(value==false) {
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int[] arr= {0, -1, 2, -3, 1};
		int n= arr.length;
		sumtriplets(arr,n);
		
		

	}

}
