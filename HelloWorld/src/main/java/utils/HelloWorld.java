package utils;
class Parent {
	String outString = "Hello world";
	public static void println(String outString) {
		System.out.println(outString);
	}
}


public class HelloWorld extends Parent {
	public static void main(String args[]) {
		Parent helloWorldInstance = new HelloWorld();
		Parent.println(helloWorldInstance.outString + "!");
	}
}

