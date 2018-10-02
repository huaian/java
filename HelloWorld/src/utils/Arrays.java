package utils;

public class Arrays {
	public static void main(String args[]){
		int[] array = {1,2,3,4,5,6};
		int[][] arrays = {array, array};
		for (int[] i: arrays){
			for (int j: i){
				System.out.println(j);
			}
		}
	}
}
