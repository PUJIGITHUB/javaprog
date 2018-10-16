package com.java.program;

public class RverseString {

	public static void main(String[] args) {
		
		String s = "JHJF#DD*H";
		
		char c[] = s.toCharArray();
		
		
		for (int i=c.length-1  ; i>=0 ; i--) {
		
			
			System.out.print(c[i]);
		}
		
	}
}
