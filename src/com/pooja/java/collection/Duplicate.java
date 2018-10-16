package com.pooja.java.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicate {
	public static void main(String []args){
		int[] a={2,3,5,2,5,6,9,6,4,7,2};
		int b=0;
		List<Integer> tempArray = new ArrayList<>();
		Map<Integer, Integer> count = new HashMap<>();
		//initialising the count map
		for(int i =0;i<a.length;i++) {
			count.put(a[i], 0);
		}
	
		//
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && !tempArray.contains(a[i])) {
					count.put(a[i], count.get(a[i])+1);
				} else {
					continue;
				}
			}
			tempArray.add(a[i]);
		}
		
		System.out.println(count.toString());
		System.out.println(tempArray.toString());
	}
		

}

		

		

		