package utils;

class parent {
	protected String family = "family name";
}

public class Inheritance extends parent {
	public static void main(String args[]){
		Inheritance inheritance = new Inheritance();
		System.out.println(inheritance.family);
	}
}
