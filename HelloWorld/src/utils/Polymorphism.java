package utils;

public class Polymorphism {
	public static void print(int display) {
		System.out.println("int:" + display);
	}
	public static void print(String display){
		System.out.println("string:" + display);	
	}
	public static void print(char display){
		System.out.println("char:" + display);	
	}
	public static void main(String args[]){
		print(1);
		print("1");
		print('1');
	}

}
