package com.practice;

public class A {
	
	B testA() {
		
		B b1 =  new B();
		
		return b1;
		
	}
	
	class B{
		
		void testB() {
			
			System.out.println("HIII");
			
		} 
		}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		B v = a1.testA();
		v.testB();
	}
	}


