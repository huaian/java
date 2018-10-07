package utils;

public class ControlFlow {
	public static void main(String args[]){
		int condition = 7;
		switch (condition) {
			case 8: System.out.println(8);break;
			case 7: System.out.println(7);break;
			default: System.out.println("default");
		}
		switch (condition) {
			case 8: System.out.println(8);
			case 7: System.out.println(7);
			default: System.out.println("default");
		}	
	}
}
