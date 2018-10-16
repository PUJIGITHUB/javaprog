package com.pooja.java.collection;
abstract class Animal{

	abstract void run();
	abstract void eat();

}


abstract class Cow extends Animal{

	void eat() {

		System.out.println("Cow eats grass");
	}

}

class Dog extends Cow {

	void run() {

		System.out.println(" Dog is running");
	}
}


public class Abstraction {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat();
	}

}
