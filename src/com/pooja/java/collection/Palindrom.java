package com.pooja.java.collection;

public class Palindrom {

	public static void main(String[] args) {

		String reverse = " ";
		String original = "kakak";

		char c[] = original.toCharArray();

		for (int i = c.length-1 ; i<=0 ; i--) {

			reverse = reverse + c[i];	
		}

		if (original.equals(reverse)) {

			System.out.println(" Given srting is a Palindrrom");
		}

		else {

			System.out.println(" Given srting is not a Palindrrom");
		}
	}
}
