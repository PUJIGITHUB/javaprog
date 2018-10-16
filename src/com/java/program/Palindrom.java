package com.java.program;

public class Palindrom {
	
		public static void main(String[] args) {
	      String  reverse = ""; // Objects of String class
	      String original = "LAAL";
	
	      
	      char c[]  = original.toCharArray();
	 
	      for ( int i = c.length - 1; i >= 0; i-- ) {
	    	  
	         reverse = reverse + c[i];
	 
	      }
	      
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string isn't a palindrome.");
	}
}

