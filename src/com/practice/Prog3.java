package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog3 {
	static List <Integer> getSortedList(List <Integer> test){
		Collections.sort(test);
		return test;
	}
	
	static List <Integer> getList(){
	List <Integer> myList = new ArrayList<Integer>();
	myList.add(10);
	myList.add(4);
	myList.add(2);
	myList.add(121);
	myList.add(7);

	return myList = getSortedList(myList);	
	
}
	
	public static void main(String[] args) {
		Object a = Prog3.getList();
		System.out.println(a);
	
	}
}
