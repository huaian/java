package utils;
public class Arrary {
	public static void main(String args[]) {
		String[] list = new String[5];
		Integer[] intList = {
			new Integer(1),
			new Integer(2),
			new Integer(4)
		};
		list[0] = "9";
		System.out.println("list has " + list.length + " items");
		for (int i = 0; i < list.length; i++){
			System.out.println(list[i]);
		}
		System.out.println("intList has " + intList.length + " items");
		for (int i = 0; i < intList.length; i++){
			System.out.println(intList[i]);
		}

	}
}

