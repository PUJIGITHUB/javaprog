package com.pooja.java.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {

	private static List<Integer> getSortedList(List<Integer> test) {
		Collections.sort(test);
		return test;
	}

	private static int getNthElement(Integer n) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(4);
		myList.add(2);
		myList.add(121);
		myList.add(7);

		myList = getSortedList(myList);
		return myList.get(n);
	}

	public static void main(String[] args) {
		Integer abc = getNthElement(1);
		System.out.println(abc);
	}
}

