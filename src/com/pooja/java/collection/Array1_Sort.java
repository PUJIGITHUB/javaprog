package com.pooja.java.collection;

import java.util.Arrays;

public class Array1_Sort {

	public static void main(String[] arguments) {
		String names[] = { "Peter", "Patricia", "Hunter", "Sarah", "Gabe", "Gina", "Rob", "John", "Zoey", "Tammy",
				"Robert", "Sean", "Paschal", "Kathy", "Neleh", "Vecepia" };
		// System.out.println("The original order:");
		// for (int i = 0; i < names.length; i++)
		// System.out.println(i + ": " + names[i]);
		Arrays.sort(names);
		System.out.println("The new order:");
		for (int i = 0; i < names.length; i++)
			System.out.println(i + ": " + names[i]);
	}
}