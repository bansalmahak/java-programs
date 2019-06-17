package com.bridgeit.datastructure;

public class calender {
	
	private static int day(int m, int d, int y) {
		int y0 = y - (14 -m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 *m0 / 12) %7;
	return d0;
	}

	private static boolean isleapyear(int year) {
		if (((year % 4 == 0) || (year % 100 == 0)) || (year % 400 == 0)) {
			return true;
		} 
		return false;
	}

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		
		String[] months= {"january","february","march","april","may","june","july","august","september","october","november","december"};
		int[] days= { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(month==2 && isleapyear(year))days[month]=29;
			
        
		  System.out.println(" " + months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  s");
		int d= day(month, 4, year);
		
		for (int i = 0; i < d; i++)
            System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            
       System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
        }
		}
	

	


}
