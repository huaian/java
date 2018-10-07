package utils;
import java.util.Arrays;
public class ArraySort {
	public static void main(String args[]){
		int[] array = {
				3,1,4,1,5,9,2,6,5,3,5,8,9
		};
		Arrays.sort(array);
		for (int i: array) {
			System.out.println(i);
		}
	}

}
