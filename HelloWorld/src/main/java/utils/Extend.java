package utils;

class parentClass {
	protected String name = "parent";
	parentClass(String name) {
		this.name = name;
	}
	void printName(){
		System.out.println(name);
	}
}
public class Extend extends parentClass{
	protected String name = "";
	Extend (String name){
		super(name);
		this.name = name;
	}
//	void printName(){
//		super.printName();
//		System.out.println(this.name);
//	}
	public static void main(String args[]){
		Extend extendInstance = new Extend("child");
		System.out.println(extendInstance.name);
		extendInstance.printName();
	}
}
