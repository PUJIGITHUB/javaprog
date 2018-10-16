package com.pooja.java.collection;
interface Mobile{

	void call();
	void play();

}

class FirstGen implements Mobile {

	public void call() {
		System.out.println("Calling from Nikia 1100");

	}
	public void play() {

		System.out.println("palying Snakes Game");
	}
}
class SecondGen implements Mobile {

	public void call() {
		System.out.println("Calling from Nikia One plus");

	}
	public void play() {
		System.out.println("Playing Subway Surf");

	}
}

public class Interface {
	public static void main(String[] args) {
		Mobile m = new FirstGen();
		m.call();	
	}



}
