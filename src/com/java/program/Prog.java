package com.java.program;

import java.util.ArrayList;
import java.util.List;

public class Prog {


	public static void main(String[] args) {


		String as = "My name is Johan";

		String[] as1 = as.split("  ");
		String reverse= " ";
		//List<String> as2 = new ArrayList<String>();


		for(int i = as1.length-1 ; i>=0 ;i--)
		{

			//as2.add(as1[i]);
			reverse = reverse+as1[i];

		}

		System.out.println( reverse);
	}
}
