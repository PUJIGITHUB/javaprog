package com.pooja.java.collection;

public class ReverseNumber {
	public static void main(String[] args) {
		
	
	int i = 12234 , reverse = 0;
	
	while(i!=0) {
		
		int c = i%10;
		reverse = c+reverse*10;
		i/=10;
		
				
	}
	
	System.out.println(reverse);
	
	if (i ==reverse) {
		
		System.out.println("palindrom");
	}
	
	else {
		System.out.println("palindrom not");
		
	}
	}
}
