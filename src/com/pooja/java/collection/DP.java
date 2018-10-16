package com.pooja.java.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class DP {

	public static void main(String[] args)
    {
        int[] array = {1,1,2,3,4,5,6,6,7,8,6};
        //Set<Integer> a = new HashSet<Integer>();
	
        /*for (int i=0 ; i<array.length ; i++) {
        	
        	if(a.add(array[i])== false) {
        		
        		System.out.println("Duplicate element found : " + array[i]);
        		
        	}*/
        LinkedHashMap<Integer , Integer> map = new LinkedHashMap<Integer , Integer>();
        for(int i=0 ; i<array.length ; i++) {
        Integer key =  array[i];
        
        
        if (map.containsKey(key)){
        	Integer value = map.get(key);
        	value++;
        	map.put(key, value);
        }
        else {
        	map.put(key, 1);
        }
        }
        System.out.println(map);
        
        for ( Integer key : map.keySet())
        if (map.get(key)>1) {
        	
        	System.out.println( key );
        }
        
    } 
}

