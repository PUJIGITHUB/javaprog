package com.practice;

public class SecondHighest {
	public static void main(String args[])
	{ 

		int numbers[] = {6,3,37,12,46,5,64,21};
		int highest = 0;
		int second_highest = 0;

		for(int i = 0 ; i<numbers.length ; i++ ) {

			if(highest < numbers[i]){

				second_highest = highest;
				highest =numbers[i];

			} else if(second_highest < numbers[i]){

				second_highest = numbers[i];

			}
		
		}
		System.out.println("First Max Number: "+highest);
		System.out.println("Second Max Number: "+second_highest);


	}
	}
	




