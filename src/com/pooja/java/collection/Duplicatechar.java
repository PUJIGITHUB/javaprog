package com.pooja.java.collection;

public class Duplicatechar {
	
	public static void main(String[] args) {
		
		String s = "Tryyujugsdj";
		
		char[] c = s.toCharArray();
		
		for(int i = 0 ; i<s.length() ;i++) {
			
			for (int j = i+1 ; j<s.length() ;j++) {
				
				if (i!=j && c[i]==c[j]) {
					
					System.out.println( c[i] );
				}
			}
		}
	}

}
