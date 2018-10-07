package utils;

public class Encapsulation {
	private String name;
	Encapsulation  (String name)  {
		this.name = name;
	}
	String getName () {
		return this.name;
	}
	public static void main (String args[]) {
		Encapsulation encapsulation = new Encapsulation("Jack");
		System.out.println(encapsulation.getName());
	}
}
