package com.bridgeit.util;


public class algorithmutility {

		public algorithmutility() {
	// TODO Auto-generated constructor stub
}




		public  void process(String w1,String w2) {
			String out1=this.sortString1(w1);
			String out2=this.sortString1(w2);
			
			System.out.println(out1 + " the letters of "+w1+" in order");
			System.out.println(out2 + " the letters of "+w2+" in order");
			
			if(out1.equals(out2)) {
				System.out.println("the entered string is anagram");
			}
				else {
					System.out.println("the entered  string is not  anagram");	
		}
		}
		public static String sortString1(String input) {
			StringBuffer sb = new StringBuffer();
			for(char a = 'a'; a <= 'z'; a++){
			     
			      // iterate over every letter in the word
			      for(int i=0; i < input.length(); i++){
			       
			       
			        if(a == input.charAt(i)){

			          sb.append(a);
			          
			        }
			        
			        
			      }
			      
			    }
		return sb.toString();
		
	}
		public String primenumber() {
			String primenumber="";
			for(int i =0; i<=1000; i++ ) {
				int count =0;
				for(int j=i;j>=1;j--) {
					if(i%j==0) {
						count++;
						
					}
					
				}
				if(count >=2) {
					primenumber= primenumber+i +"";
					
					
				}
			}
			return primenumber;
			
		}
		
		  
		public static int temperatureconversion(int tem, char t) {
			int conver = 0;
			  if(t=='c'||t=='C') {
				  conver = (tem * 9/5) + 32;
			  }
				  if(t=='f'||t=='F') {
					  conver = (tem - 32) * 5/9 ;
				  }
				  else {
					  System.out.println("enter the correct input");
				  
			  }
				  return conver;
		}
			  
	public static int daysofweek(int d, int m, int y) {
			int y0 = y - (14 -m) / 12;
			int x = y0 + y0/4 - y0/100 + y0/400;
			int m0 = m + 12 * ((14 - m) / 12) - 2;
			int d0 = (d + x + 31 *m0 / 12) %7;

	return d0;
}
	public static int squareroot(int c) {
		int t=c;
		double epsilon = 1e-15;
		if( Math.abs(t - c/t) > epsilon*t ) {
			t = (c / t + t)/2;
		}
		return t;
	}
	public static double monthlypayment(double p,double y, double R) {
	    double n = 12*y;
	    double r= R/(12*100);
		double payment= (p*r)/(1-Math.pow(1+r, -n));
		return payment;
	}
	public static void bubblesort(int[] arr, int count) {
		for(int k=0; k < count-1 ;k++) {
			for(int  i=0; i<count-k-1 ; i++) {
				if (arr[i]> arr[i+1]) {
					
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			
			
		}
		
		
		
	}
	public static int[] toBinary(int d) {
		String bin = "";
		int a,count = 0;
		while (d > 0) {
			a=d%2;
			if(a==1) {
				count++;
			}
			bin=bin+""+a;
			d=d/2;
		}
		return stringToIntArray(bin);
	}

	private static int[] stringToIntArray(String bin) {
		int[] binary = new int[bin.length()];
		for (int i = 0; i < binary.length; i++) {
			binary[i] = bin.charAt(i) - 48;
		}
		return binary;
	}

	public static int toDecimal(int[] binary) {
		int dec = 0, j = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			if (binary[i] == 1) {
				dec = dec + (int) Math.pow(2, j);
			}
			j++;
		}
		return dec;
	}
	public static String[] insertionsort(String[] arr,int count) {
	String temp=" ";
		for(int i =0; i<count;i++) {
			for(int j=i+1; j<count;j++) {
				if(arr[i].compareToIgnoreCase(arr[j])>0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
				}
		return arr;
		}

	public static void printStringarray(String[] arr) {
		for(int i= 0; i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		}
	 public static void printArray(String[] array) 
	    { 
	        int n = array.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(array[i] + " "); 
	        System.out.println(); 
	}
	




	public static boolean isNumberPalindrome(int number)
	{
		int r=0,rev=0;
		int tempnumber=number;
		while(number!=0)
		{
			r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		if(tempnumber!=rev)
		{
			return true;
		}

		return false;
	}
	static void merge(String arr[], int start, int mid, int end) 
    { 
     
        int n1 = mid - start + 1; 
        int n2 = end - mid; 
  
        String L[] = new String [n1]; 
        String R[] = new String [n2]; 
  
    
        for (int i=0; i<n1; ++i) 
            L[i] = arr[start + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[mid + 1+ j]; 
  
  
          int i = 0, j = 0; 
        int k = start; 
        while (i < n1 && j < n2) 
        { 
            if (L[i].compareToIgnoreCase(R[j])<0)  
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
 public static void sort(String arr[], int start, int end) 
    { 
        if (start < end) 
        { 
            int m = (start+end)/2; 
            sort(arr, start, m); 
            sort(arr , m+1, end); 
            merge(arr, start, m, end); 
        } 
    } 




		
		
	}




