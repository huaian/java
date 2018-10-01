package utils;

import java.util.ArrayList;

public class Generics {
	public static void main (String args[]) {
		ArrayList<Integer> genericsArrayList = new ArrayList<Integer>();
		genericsArrayList.add(new Integer(1));
		genericsArrayList.add(new Integer(2));
		genericsArrayList.add(new Integer(3));
		genericsArrayList.add(new Integer(4));
		for (Integer i : genericsArrayList) {
			System.out.println(i);
		}
		
	}
}
