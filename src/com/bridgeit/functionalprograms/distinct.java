package com.bridgeit.functionalprograms;

public class distinct {
	public static void main (String[] args) {
		int num= Integer.parseInt(args[0]);
		boolean[]collected= new boolean[num];
		int count=0;
		int distinct=0;
		
		while(distinct<num) {
			int value=(int) (Math.random()*num);
			count++;
		if(!collected[value]) {
			distinct++;
			collected[value]=true;
		}
		}
		System.out.println(" the number you entered : " +num);
    	System.out.println("repeated number : " +count);
		System.out.println("distinct numbers : " +distinct);
		
		
		 
		
	}

}
