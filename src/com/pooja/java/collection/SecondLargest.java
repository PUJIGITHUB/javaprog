package com.pooja.java.collection;

public class SecondLargest {

	public static void main(String[] args) {
		int[] a = {5 , 10 , 12 , 15 , 19 , 10 };
		
		int temp; 
		for(int i = 0; i<a.length ; i++) {
			
			 for(int j = i+1; j<a.length; j++){
				 
				 if(a[i]>a[j]){
		               temp = a[i];
		               a[i] = a[j];
		               a[j] = temp;
				 
		               System.out.println(temp);
			 }
		}

		}
		
		

	}
}


