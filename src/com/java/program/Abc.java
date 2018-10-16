package com.java.program;

import java.util.ArrayList;
import java.util.List;

public class Abc {

	public static  char[] reverseStringWithoutFor(String str, List<Character> specialChars1) {

		int index = str.length()-1;
		int currentIndex = 0;
		char[] output = str.toCharArray();

		while(index>0) {
			if(!specialChars1.contains(str.charAt(index))) {
				char currentItem = str.charAt(currentIndex); 
				if (specialChars1.contains(currentItem))
				{
					currentIndex++;
					continue;
				}
				output[index] = currentItem;
				currentIndex++;
				index--;
			}
			else
			{
				index--;
			}	
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "####Hello@123#";
		List<Character> specialChars = new ArrayList<Character>();
		specialChars.add('#');
		specialChars.add('@');

		char[] reverse = reverseStringWithoutFor(str,specialChars);
		System.out.println(reverse);
	}
}