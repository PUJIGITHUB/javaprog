package com.pooja.java.collection;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Duplicate5 {

	public static void main(String[] args) {
		String[] src = { "abc", "mnp", "mnp", "abc", "ldg", "mnp", "abc" };
		java.util.List<String> duplicates = new ArrayList<>();
		// Map<String, Integer> count = new HashMap();
		// Arrays.asList(src).stream().forEach(element -> count.put(element, 0));

		Dictionary dict = new Hashtable<>();
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < src.length; i++) {
			Object item = dict.get(src[i]);
			if(item!=null)
			{
				
			}
//			if (duplicates.contains(src[i])) {
//				System.out.println(src[i]);
//			} else {
//				duplicates.add(0, src[i]);
//			}
		}

		// for (int i = 0; i < src.length; i++) {
		// if (set.contains(src[i])) {
		// if (!duplicates.contains(src[i])) {
		// duplicates.add(src[i]);
		// System.out.println(src[i]);
		// }
		// } else {
		// set.add(src[i]);
		// }
		// }
	}
}
