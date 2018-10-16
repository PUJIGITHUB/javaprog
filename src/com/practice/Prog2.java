package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog2 {
	static List <Integer> getSortedList(List <Integer> test){
		Collections.sort(test);
		return test;
	}
	
	static int getnthElement(Integer n){
	List <Integer> myList = new ArrayList<Integer>();
	myList.add(10);
	myList.add(4);
	myList.add(2);
	myList.add(121);
	myList.add(7);

	myList = getSortedList(myList);
	return myList.get(n);
}
	
	public static void main(String[] args) {
		int a  = Prog2.getnthElement(1);
		System.out.println(a);
	}
	
}



